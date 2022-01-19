package com.ymsli.day5.question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BookCollection {
	private String ownerName;
	private ArrayList<Book> books;
	
	
	
	public BookCollection(String ownerName, ArrayList<Book> books) {
		this.ownerName = ownerName;
		this.books = books;
	}

	public boolean hasBook(Book b)
	{
		boolean flag=false;
		for(Book i:books)
		{
			if((b.getBookTitle()).equals(i.getBookTitle()) && (b.getBookAuthor()).equals(i.getBookAuthor()))
			{
				flag=true;
				break;
			}
		}
		
		return flag;
	}

	@Override
	public String toString() {
		return "BookCollection [ownerName=" + ownerName + ", books=" + books + "]";
	}

	public void sort()
	{
		Collections.sort(books, new BookSortTitleAuthor());
		for(Book i:books)
		{
			System.out.println(i);
		}
	}
	
}
