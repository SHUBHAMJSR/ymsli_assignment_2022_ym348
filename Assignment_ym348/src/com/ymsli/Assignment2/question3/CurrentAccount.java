package com.ymsli.Assignment2.question3;

public class CurrentAccount extends Account{
	
	private int tradeLicenseNumber;

	
	public CurrentAccount(String memberName, String accountNumber, double accountBalance, int tradeLicenseNumber) {
		super(memberName, accountNumber, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	
	public double getBalance()
	{
		return super.getAccountBalance();
	}
	
	public void withdraw(double amt)
	{
		if(amt<super.getAccountBalance())
		{
			
				super.setAccountBalance(super.getAccountBalance()-amt);
			
		}
		else
		{
			System.out.println("not enough amount to do transaction");
		}
	}
}
