package com.ymsli.assignment3.question1;

abstract class Employee {
	private int employeeId;
	private String empname;

	public abstract double getEmployeeSalary();
	public abstract void setEmployeeSalary(double incrementInterest);
	public Employee(int employeeId, String empname) {

		this.employeeId = employeeId;
		this.empname = empname;
	}
	


	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	
}
