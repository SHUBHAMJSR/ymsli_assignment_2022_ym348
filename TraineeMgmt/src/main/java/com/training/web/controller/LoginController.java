package com.training.web.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.model.exceptions.UserNotFoundException;
import com.training.model.persistance.User;
import com.training.model.persistance.UserDao;
import com.training.model.service.UserService;
import com.training.model.service.UserServiceImpl;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private UserService userService= new UserServiceImpl();
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Optional<com.training.model.persistance.User>optUser= userService.getUser(username, password);
		User user=null;
		try{
			user= optUser.orElseThrow(()-> new UserNotFoundException("user not found"));
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("user", user);
			response.sendRedirect("TrainingController.do?action=showall");
		}catch(UserNotFoundException ex) {
			response.sendRedirect("login.jsp?status=login failed");
		}
	}

	

}