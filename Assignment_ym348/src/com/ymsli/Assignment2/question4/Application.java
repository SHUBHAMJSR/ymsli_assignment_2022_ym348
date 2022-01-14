package com.ymsli.Assignment2.question4;

import java.util.*;
public class Application {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter userid, name, grade");
		String userId=in.nextLine();
		String name=in.nextLine();
		double grade=in.nextDouble();
		
		System.out.println("Constructor 1 calling and display() calling");
		Student s1=new Student(userId,name,grade);
		s1.display();
		
		System.out.println("Constructor 2 calling and display calling which have year as a parameter");
		Student s2=new Student(userId,name);
		s2.display(2022);
		
		System.out.println("Constructor 2 calling and display calling which have year as a parameter");
		Student s3=new Student(userId);
		s3.display(2022);
		
		in.close();
	}
}
