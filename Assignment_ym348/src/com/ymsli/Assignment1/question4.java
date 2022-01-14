/*
 * 
 * Q4. Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
array. The method's signature is as follows:
public static int[] copyOf(int[] array)
 * 
 * */

package com.ymsli.Assignment1;

public class question4 {
	
	public static int[] copyOf(int[] array)
	{
		int b[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			b[i]=array[i];
		}
		return b;
	}
	
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int m[]=copyOf(a);
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i]+" ");
		}
	}
}
