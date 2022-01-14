package com.ymsli.assignment3.question1;

class CommissionEmployee extends Employee{
	
	private double percentageOfSales;
	private int weeklySale;
	
	public CommissionEmployee(int employeeId, String empname,double percentageOfSales,int weeklySale) {
		super(employeeId, empname);
		this.percentageOfSales=percentageOfSales;
		this.weeklySale=weeklySale;
		
	}
	
	public double getEmployeeSalary()
	{
		return percentageOfSales*weeklySale;
	}

	
	public double getPercentageOfSales() {
		return percentageOfSales;
	}

	public void setPercentageOfSales(double percentageOfSales) {
		this.percentageOfSales = percentageOfSales;
	}

	public void setEmployeeSalary(double percentageOfSales)
	{
		this.weeklySale=(int) ((this.weeklySale*percentageOfSales)/100);
	}

	public double getPayment()
	{
		return this.getEmployeeSalary();
	}
	
}
