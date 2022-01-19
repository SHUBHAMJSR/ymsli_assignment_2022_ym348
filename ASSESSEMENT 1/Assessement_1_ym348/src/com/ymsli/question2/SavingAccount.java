package com.ymsli.question2;

import java.util.Scanner;

public class SavingAccount extends Account{
private float interestRate;




public SavingAccount(float balance, String number, float interestRate) {
	super(balance, number);
	this.interestRate = interestRate;
}

@Override
public String toString() {
return "SavingsAccount [interestRate=" + interestRate + "]";
}

public float getInterest() {
return accountBalance*this.interestRate/100;
}

}