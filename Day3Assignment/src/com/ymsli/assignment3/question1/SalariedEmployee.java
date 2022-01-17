package com.ymsli.assignment3.question1;

class SalariedEmployee extends Employee{
	
	private double weeklyRate;
	private int numberOfWeek;

	public SalariedEmployee(int employeeId, String empname, double weeklyRate,int numberOfWeek) {
		super(employeeId, empname);
		this.weeklyRate=weeklyRate;
		this.numberOfWeek=numberOfWeek;
	}
	


	public double getWeeklyRate() {
		return weeklyRate;
	}



	public void setWeeklyRate(double weeklyRate) {
		this.weeklyRate = weeklyRate;
	}

	public void setEmployeeSalary(double incrementInterest)
	{
		this.weeklyRate=this.weeklyRate+((this.getWeeklyRate()*incrementInterest)/100);
	}

	public double getEmployeeSalary()
	{
		return weeklyRate*numberOfWeek;
	}
	public double getPayment()
	{
		return this.getEmployeeSalary();
	}
}
