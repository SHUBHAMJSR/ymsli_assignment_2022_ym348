package com.ymsli.Assignment2.question3;

import java.util.*;
public class Bank {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the username");
		String userName=in.nextLine();
		System.out.println("What Account u would like to open press 1 to open new Savings bank Account and press 2 to open "
				+ "Current Bank Account");
		int ch=in.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the Account Balance, interest and minimum limit");
			Random rand = new Random();
			String num ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+ 
			rand.nextInt(10)+ rand.nextInt(10);
			double accountBalance=in.nextDouble();
			double interest=in.nextDouble();
			int min_limit=in.nextInt();
			SavingsAccount a=new SavingsAccount(userName,num,accountBalance,interest,min_limit);
			
			System.out.println("Enter 1 to deposit money, 2 to withdraw money, 3 to diplay the Bank details, and 4 to exit");
			int ch1=in.nextInt();
			switch(ch1)
			{
				case 1:
					System.out.println("Enter the amount of money to be deposited");
					double amount=in.nextDouble();
					System.out.println("Do u want to know the Balance info please press y for yes and prees n for no");
					char choice3= in.next().charAt(0);
					if(choice3=='y')
					{
						System.out.println("Before deposit Balance: "+a.getAccountBalance());
						a.moneyDeposit(amount);
						System.out.println("after deposit balance: "+a.getAccountBalance());
					}
					else
					{
						a.moneyDeposit(amount);
					}
					break;
				case 2:
					System.out.println("Enter the amount of money to be Withdraw");
					double amountWithdraw=in.nextDouble();
					System.out.println("Do u want to know the Balance info please press y for yes and prees n for no");
					char choice4= in.next().charAt(0);
					if(choice4=='y')
					{
						System.out.println("Before Withdraw Balance: "+a.getAccountBalance());
						a.withdraw(amountWithdraw);
						System.out.println("after Withdraw balance: "+a.getAccountBalance());
					}
					else
					{
						a.withdraw(amountWithdraw);
					}
					break;
				case 3:
					System.out.println("the balance is: "+a.getAccountBalance());
					break;
				case 4:
					System.out.println("Exit Application");
			}
			
			break;
		case 2:
			System.out.println("Enter the Account Balance,  trade license number");
			Random rand1 = new Random();
			String num1 ="" + rand1.nextInt(10) + rand1.nextInt(10)+ rand1.nextInt(10)+ 
			rand1.nextInt(10)+ rand1.nextInt(10);
			double accountBalance1=in.nextDouble();
			int tradeLicenseNumber=in.nextInt();
			CurrentAccount a1=new CurrentAccount(userName,num1,accountBalance1,tradeLicenseNumber);
			

			System.out.println("Enter 1 to deposit money, 2 to withdraw money, 3 to diplay the Bank details, and 4 to exit");
			int ch2=in.nextInt();
			switch(ch2)
			{
				case 1:
					System.out.println("Enter the amount of money to be deposited");
					double amount=in.nextDouble();
					System.out.println("Do u want to know the Balance info please press y for yes and prees n for no");
					char choice3= in.next().charAt(0);
					if(choice3=='y')
					{
						System.out.println("Before deposit Balance: "+a1.getAccountBalance());
						a1.moneyDeposit(amount);
						System.out.println("after deposit balance: "+a1.getAccountBalance());
					}
					else
					{
						a1.moneyDeposit(amount);
					}
				case 2:
					System.out.println("Enter the amount of money to be Withdraw");
					double amountWithdraw=in.nextDouble();
					System.out.println("Do u want to know the Balance info please press y for yes and prees n for no");
					char choice4= in.next().charAt(0);
					if(choice4=='y')
					{
						System.out.println("Before Withdraw Balance: "+a1.getAccountBalance());
						a1.withdraw(amountWithdraw);
						System.out.println("after Withdraw balance: "+a1.getAccountBalance());
					}
					else
					{
						a1.withdraw(amountWithdraw);
					}
					break;
				case 3:
					System.out.println("the balance is: "+a1.getAccountBalance());
					break;
				case 4:
					System.out.println("Exit Application");
			}
			
			break;
		}
		
		
	}
}
