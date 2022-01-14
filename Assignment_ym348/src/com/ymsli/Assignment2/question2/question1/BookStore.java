package com.ymsli.Assignment2.question2.question1;

import java.util.Scanner;

public class BookStore{
	
	Book[] books;
	private int ctr;
	public BookStore()
	{
	books=new Book[10];
	ctr=2;
	books[0]=new Book("Beleive in Yourself","Joseph Murphy","1111",200);
	books[1]=new Book("The Checklist Manifesto","Atul Gawande","2222",2000);
//	books[2]=new Book("The Four Agreements","Miguel Ruiz","3333",5000);
//	books[3]=new Book("The varieties of Human Experience","William James","4444",5000);
//	books[4]=new Book("A tale of Three Kings","Gene Edwards","5555",6000);
	}
	
	
	
	void sell(String bookTitle, int noOfCopies)
	{
		boolean flag=false;
		int i;
		for(i=0;i<ctr;i++)
		{
			if((books[i].bookTitle).equals(bookTitle))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			books[i].numOfCopies-=1;
		}
		else if(flag==false)
		{
			System.out.println("The book name "+bookTitle+"is not available.");
		}
		
	}
	void order(String isbn, int noOfCopies)
	{
		int i;
		System.out.println(isbn);
		boolean flag=false;
		for(i=0;i<ctr;i++)
		{
			if((books[i].ISBN).equals(isbn))
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			Scanner in=new Scanner(System.in); 
			System.out.println("Enter the book details:-");
			String bookTitle = in.nextLine();
			String author =in.nextLine();in.next();
			
			books[ctr]=new Book(bookTitle,author,isbn,noOfCopies);
			ctr+=1;
			in.close();
		}
		System.out.println(flag);
		if(flag==true)
		{
			books[i].numOfCopies+=noOfCopies;
			System.out.println("Details updated");
		}

		
	}
	void display()
	{
		for(int i=0;i<ctr;i++)
		{
			books[i].display();
		}
	}

}
