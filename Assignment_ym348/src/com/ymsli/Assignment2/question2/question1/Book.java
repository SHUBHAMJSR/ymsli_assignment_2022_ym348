
/*
 * Create a Book Class
 * 
 * */

package com.ymsli.Assignment2.question2.question1;

public class Book {
	
	String bookTitle;
	String author;
	String ISBN;
	int numOfCopies;
	Book(String bookTitle, String author, String ISBN, int numOfCopies)
	{
		this.bookTitle=bookTitle;
		this.author=author;
		this.ISBN=ISBN;
		this.numOfCopies=numOfCopies;
	}
	void display()
	{
		System.out.println("Book title" +" | " + "Author" +" | "+ "ISBN" +" | " +"numOfCopies");
		System.out.println(bookTitle + " | " + author +" | " + ISBN +" | " + numOfCopies);
	}
	
}
