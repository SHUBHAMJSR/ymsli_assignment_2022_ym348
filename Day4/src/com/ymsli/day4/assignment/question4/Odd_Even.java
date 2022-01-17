package com.ymsli.day4.assignment.question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Odd_Even {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//int n=-1;
		
			try
			{
				int n;
				do
				{
					System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
					n=in.nextInt();
					if(n==-1)
					{
						System.out.println("Exit Application");
						break;
					}
					if(n%2==0)
					{
						System.out.println("The number is even");
					}
					else
					{
						System.out.println("The number is odd");
					}
				}while(n!=-1);
			}
			catch(InputMismatchException e)
			{
				System.out.println("You must enter an integer");
			}
		

	}
}
