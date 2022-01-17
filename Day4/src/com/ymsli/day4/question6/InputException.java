package com.ymsli.day4.question6;

import java.util.Scanner;

public class InputException extends Exception{


	public InputException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static void main(String[] args) throws InputException {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		
		try {
			if(n>100)
			{
				throw new InputException("Number can’t be greater than 100");
			}
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				}
		in.close();
	}
}


