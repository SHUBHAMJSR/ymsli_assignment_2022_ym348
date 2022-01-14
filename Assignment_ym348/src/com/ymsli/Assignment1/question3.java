package com.ymsli.Assignment1;

/*
 * 
 * 
 * Q3. Write a program called GradesAverage, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the 
grades of each of the students and saves them in an int array called grades. Your program shall 
check that the grade is between 0 and 100. A sample session is as follow:
Enter the number of students: 3
Enter the grade for student 1: 55
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is: 56.0

 */
import java.util.*;
public class question3 {

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int numstudents=in.nextInt();
		int grade[]=new int[numstudents];
		int s=0;
		boolean flag=true;
		for(int i=1;i<=numstudents;i++)
		{
			System.out.print("Enter the grade of student "+ i+" ");
			grade[i-1]=in.nextInt();
			if(grade[i-1]>=1 && grade[i-1]<=100)
			{
				s+=grade[i-1];
			}
			else
			{
				
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			double avg=(s/numstudents);
			System.out.println("Average is: "+avg);
		}
		else
		{
			System.out.print("Invalid grade, try again...");
		}
		in.close();
	}
}
