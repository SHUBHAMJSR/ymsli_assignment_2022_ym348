package com.ymsli.jdbc.persistence;

import java.util.List;

public interface DaoInterface {
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public void addBook(Book book);
	public void updateBook(Book book);
	public void removeBook(int bookId);
}
