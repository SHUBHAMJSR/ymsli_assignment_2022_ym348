package com.ymsli.day4.question5;


import java.util.Scanner;

public class NumberException extends Exception{


//	public Exception(String arg0) {
//		super(arg0);
//		// TODO Auto-generated constructor stub
//	}
//	
	
	
	public NumberException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		
		try {
			if(n>100)
			{
				throw new Exception("Number can’t be greater than 100");
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				}
		in.close();
	}
}
