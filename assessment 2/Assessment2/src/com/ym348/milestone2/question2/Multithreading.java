package com.ym348.milestone2.question2;

class Myjob implements Runnable{
	
	private int sum;
	public Myjob(int sum) {
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		//taking random number
		int rand=(int)(Math.random()*10);
		System.out.println("Number generated: "+rand);
		
		//sum is the critical section 
		synchronized(this)
		{
			sum+=rand;
		}
	}
	
}
public class Multithreading {
	public static void main(String args[])
	{
		//Creating a job
		Myjob job=new Myjob(0);
		
		//Creation of five threads
		Thread t1=new Thread(job,"A");
		Thread t2=new Thread(job,"B");
		Thread t3=new Thread(job,"C");
		Thread t4=new Thread(job,"D");
		Thread t5=new Thread(job,"E");
		
		//Starting of the five threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		//Applying join so that all threads execute before main thread exits
		//Applied try catch block because of join method as we need to catch interrupted exception
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of all random numbers of the threads are: " + job.getSum());
		
		System.out.println("Exit main thread");
		
	}
}
