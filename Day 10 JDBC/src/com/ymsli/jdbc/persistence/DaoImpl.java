package com.ymsli.jdbc.persistence;

import java.util.ArrayList;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

import com.ymsli.jdbc.exceptions.BookNotFoundException;
import com.ymsli.jdbc.exceptions.DataAccessException;

public class DaoImpl implements DaoInterface{

	Connection connection;
	//The connection is being setup with the database
	public DaoImpl()
	{
		connection=ConnectionFactory.getConnection();
	}
	
	@Override
	public List<Book> getAllBooks() {
		
		List<Book> books=new ArrayList<Book>();
		System.out.println("Details of All books");
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("select * from Book");
			
			ResultSet rs=preparedStatement.executeQuery();
			
			
			while(rs.next())
			{
				Book book=new Book(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getDate(5),rs.getDouble(6));
				books.add(book);
			}
			
		} catch (SQLException e) {
			throw new DataAccessException("No Data found");
		}
		
		
		return books;
	}

	@Override
	public Book getBookById(int bookId) {
		
		Book book=null;
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement("select * from Book where id=?");
			preparedStatement.setInt(1,3);
			
			ResultSet rs=preparedStatement.executeQuery();
			
			if(rs.next())
			{
				book=new Book(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getDate(5),rs.getDouble(6));
			}
			else
			{
				throw new BookNotFoundException("Book not Found");
			}
			System.out.println("Book found");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return book;
	}

	@Override
	public void addBook(Book book) {

		try {
			PreparedStatement pstmt=connection.prepareStatement
					("insert into book(isbn,title,author,pubdate,price) values(?,?,?,?,?)");
			
			pstmt.setString(1,book.getIsbn());
			pstmt.setString(2,book.getTitle());
			pstmt.setString(3,book.getAuthor());
			pstmt.setDate(4, (Date) book.getDate());
			pstmt.setDouble(5,book.getPrice());
			
			pstmt.executeUpdate();
			
			System.out.println("Record inserted in book");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateBook(Book book) {
		
		try {
			PreparedStatement pstmt=connection.prepareStatement
					("update book set price=? where id=?");
			
			pstmt.setDouble(1,book.getPrice());
			pstmt.setInt(2,book.getId());
			pstmt.executeUpdate();
			
			System.out.println("book price updated to "+ book.getPrice()+ "for id: "+ book.getId());
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void removeBook(int bookId) {
		
		
		try {
			PreparedStatement pstmt =connection.prepareStatement("delete from book where id=?");
			
			pstmt.setInt(1, bookId);
			
			pstmt.executeUpdate();
			System.out.println("Book removed with id: "+bookId);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
