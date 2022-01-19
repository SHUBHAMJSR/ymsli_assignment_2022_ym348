package com.ymsli.question2;

import java.util.Scanner;

class Account
{
	
	public float accountBalance;
	private String accountNumber;
	private Owner owner;
	
	
	public Account( float accountBalance, String accountNumber) {
Scanner in =new Scanner(System.in);
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		System.out.println("Enter Owner Information");
		System.out.println("Enter Name");
		String name=in.next();
		System.out.println("Enter nic");
		String id=in.next();
		System.out.println("Enter Date of birth");
		Date d =new Date(19,1,2022);
		this.owner = new Owner(name,d,id);
	}
	


	
	@Override
	public String toString() {
		return "Account [accountBalance=" + accountBalance + ", accountNumber=" + accountNumber + ", owner=" + owner
				+ "]";
	}

	public Owner getOwner() {
		return owner;
		}


	public void print()
	{
		System.out.println(toString());
	}
	public void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the account owner details, Account balance and Account number");
		float accountBalance=in.nextFloat();
		String accountNumber=in.nextLine();
	}


	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void deposit(double amount) {
		accountBalance+=amount;
		}
		public void withdraw(double amount) {
			accountBalance-=amount;

		}

		public double getBalance() {
		return accountBalance;
		}




	


	
}
