package com.ymsli.Assignment2.question3;

class SavingsAccount extends Account{
	private double interest;
	private int min_limit;
	
	public SavingsAccount(String memberName, String accountNumber, double accountBalance)
	{
		super(memberName,accountNumber,accountBalance);
		interest=5;
		min_limit=500;
	}
	public SavingsAccount(String memberName, String accountNumber, double accountBalance, double interest, int min_limit) {
		super(memberName, accountNumber, accountBalance);
		this.interest = interest;
		this.min_limit = min_limit;
	}
	
	public double getBalance()
	{
		double bal=super.getAccountBalance() + super.getAccountBalance()*(interest/100);
		return bal;
	}
	
	public void withdraw(double amt)
	{
		if(amt<super.getAccountBalance())
		{
			if((super.getAccountBalance()-amt)>min_limit)
			{
				super.setAccountBalance(super.getAccountBalance()-amt);
			}
			else
			{
				System.out.println("Transaction not successful since minimum limit is not met.");
			}
		}
		else
		{
			System.out.println("not enough amount to do transaction");
		}
	}
	
	
	
	
}
