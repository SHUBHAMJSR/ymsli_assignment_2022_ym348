package com.ymsli.jdbc.controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.ymsli.jdbc.exceptions.DataAccessException;
import com.ymsli.jdbc.persistence.Book;
import com.ymsli.jdbc.service.BookService;
import com.ymsli.jdbc.service.BookServiceImpl;

class BookTester {
	
	private static void printAllBooks(BookService bookService) {
		try{
			List<Book> books=bookService.getAllBooks();
			for(Book book: books) {
				System.out.println(book);
			}
		}catch(DataAccessException ex) {
			
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		System.out.println("--------Book Details:---");
		printAllBooks(bookService);
		
		Date date=new Date(12, 03, 1998);
		Book book1=new Book("6666", "Thinking in java","Bruce Eckel",date,1500.00);
		bookService.addBook(book1);
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the book id");
		int bookId=in.nextInt();
		Book book2=bookService.getBookById(bookId);
		System.out.println(book2);
		
		Date date1=new Date(12, 03, 1998);
		Book book3=new Book(6,"6666", "Thinking in java","Bruce Eckel",date1,2500.00);
		bookService.updateBook(book3);
		
		System.out.println("enter the book id that you wnat to delete");
		int bookId1=in.nextInt();
		bookService.removeBook(bookId1);
		
		in.close();
	}
}
