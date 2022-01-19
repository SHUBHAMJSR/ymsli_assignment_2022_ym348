package com.ymsli.day5.question3;

import java.awt.List;
import java.util.ArrayList;

public class Book_main {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		Book b1 = new Book("OCP Oracle certified professional study guide","Scott Selikoff");
		
		Book b2 = new Book("Java the complete reference","Kathy Sierra");

		Book b3 = new Book("HeadFirst Java","Kathy Sierra");
		Book b4 =new Book("Thinking in java","Bruce Eckel");
		books.add(b1);
		books.add(b2);
		books.add(b3);
	
		BookCollection collection = new BookCollection("Shubham",books);
		
		if(collection.hasBook(b1)==true)
		{
			System.out.println("Book found"+b1.toString());
		}
		else
		{
			System.out.println("Book not found"+b1.toString());
		}
		
		if(collection.hasBook(b4)==true)
		{
			System.out.println("Book found"+b4.toString());
		}
		else
		{
			System.out.println("Book not found"+b4.toString());
		}
		System.out.println("----Books-----");
		collection.sort();
	}
}
