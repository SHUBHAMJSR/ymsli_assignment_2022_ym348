package com.ymsli.Assignment2.question2.question1;

import java.util.Scanner;

public class BookStoreApp {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter �1�, to display the Books: Title � Author � ISBN - Quantity. \n" + 
				"Enter �2�, to sell books. \n" + 
				"Enter �3�, to order new books. \n" + 
				"Enter �0�, to exit the system. \n" );
			
		
		BookStore b=new BookStore();
		int choice;
		
		do
		{
			choice =in.nextInt();
			switch(choice)
			{
			case 1:
				
				b.display();
				break;
				
			case 2:

				System.out.println(" Enter the Title, number of copies to sell");
				String Title=in.nextLine();in.next();
				int noOfCopies =in.nextInt();
				b.sell(Title,noOfCopies);

				break;
				
			case 3:
				String st1;
				
				do
				{
					System.out.println("Want to order a book say y else say n, Enter the ISBN, number of copies");
					st1=in.nextLine();in.nextLine();
					String isbn1=in.nextLine();
					int noOfCopies1 =in.nextInt();
					//System.out.println(isbn1);
					b.order(isbn1,noOfCopies1);
				}
					while(st1.equals("y"));
				break;
	
			case 0:
				System.out.println("Exit the Application");
				break;
			}	
		}while(choice!=0);
		in.close();
	}
}
