
/*
 * 
 * 
 * Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
F(n)=F(n?1)+F(n?2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
 */

package com.ymsli.Assignment1;

public class question1 
{
	
	public static void main(String[] args) 
	{
		int a[]=new int[20];
		double s=0.0;
		System.out.println("The first 20 fibbonacci numbers are: ");
		a[0]=1;
		a[1]=1;
		System.out.print(a[0]+" "+a[1]+" ");
			for(int i=2;i<20;i++)
			{
				a[i]=a[i-1]+a[i-2];
				s+=a[i];
				System.out.print(a[i]+" ");
			}
		double avg= s/20.0;
		System.out.println();
		System.out.println("The first 20 fibbonacci numbers average is: "+ avg);
		
	}
	
}
