package com.ymsli.day5.q1;

import java.util.Scanner;

class Myjob implements Runnable{
	

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
		System.out.println("Thread "+Thread.currentThread().getName()+ " : "+ i);
	}
	}
	
	

}
class Multithreading
{
	public static void main(String args[])
	{
		Myjob job =new Myjob();
		
		Thread t1=new Thread(job,"A");
		Thread t2=new Thread(job,"B");
		Thread t3=new Thread(job,"c");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}