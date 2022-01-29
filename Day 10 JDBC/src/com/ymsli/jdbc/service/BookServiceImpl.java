package com.ymsli.jdbc.service;

import java.util.List;

import com.ymsli.jdbc.persistence.Book;
import com.ymsli.jdbc.persistence.DaoInterface;
import com.ymsli.jdbc.persistence.DaoImpl;

public class BookServiceImpl implements BookService{

	private DaoInterface bookDao;
	
	
	public BookServiceImpl()
	{
		bookDao=new DaoImpl();
	}
	
	@Override
	public List<Book> getAllBooks() {
		
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(bookId);
	}

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
		
	}

	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);
		
	}

	@Override
	public void removeBook(int bookId) {
		bookDao.removeBook(bookId);
		
	}

}
