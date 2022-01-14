package com.ymsli.assignment3.question1;

class HourlyEmployee extends Employee{
	
	private double hourlyRate;
	private int numberOfHoursWeek;
	
	public HourlyEmployee(int employeeId, String empname,double hourlyRate,int numberOfHoursWeek) {
		super(employeeId, empname);
		this.hourlyRate=hourlyRate;
		this.numberOfHoursWeek=numberOfHoursWeek;
	}
	
	public double getEmployeeSalary()
	{
		return hourlyRate*numberOfHoursWeek;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public void setEmployeeSalary(double incrementInterest)
	{
		this.hourlyRate=this.hourlyRate+((this.getHourlyRate()*incrementInterest)/100);
	}

}
