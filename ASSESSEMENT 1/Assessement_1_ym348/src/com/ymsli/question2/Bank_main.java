package com.ymsli.question2;

import java.util.Scanner;

public class Bank_main {
	public static void main(String args[]) {
		Account acc=null;
		while(true) {
			int opt;
			Scanner sc=new Scanner(System.in);
			System.out.println("Type Of account you want To create 1. for Savings\n2. for Current");
			opt=sc.nextInt();
			String accno;
			float balance;
			float rate;
			switch(opt) {
			case 1:
				System.out.println("Enter Account number");
				accno=sc.next();
				System.out.println("Enter Account Balance");
				balance=sc.nextFloat();
				System.out.println("Enter intrest rate");
				rate=sc.nextFloat();
				acc=new SavingAccount(balance,accno,rate);
				System.out.println(acc.getBalance());
				System.out.println(acc.getOwner());
				break;
			case 2:
				System.out.println("Enter Account number");
				accno=sc.next();
				System.out.println("Enter Account Balance");
				balance=sc.nextFloat();
				System.out.println("Enter Charges");
				rate=sc.nextFloat();
				acc=new CurrentAccount(balance,accno,rate);
				System.out.println(acc.getBalance());
				System.out.println(acc.getOwner());
			
				break;
			}
		}
	}

}