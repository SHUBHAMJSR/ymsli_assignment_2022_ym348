package com.ymsli.assignment3.question1;

import java.util.ArrayList;
import java.util.Scanner;

class EmployeeSystem {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int empid;
		String name;
		
		 ArrayList<Employee> emp
         = new ArrayList<Employee>(3);
		 
		
			SalariedEmployee e=new SalariedEmployee(1111,"shubham",5000.00,4);
			HourlyEmployee h=new HourlyEmployee(2222,"raju",500.00,50);
			CommissionEmployee c=new CommissionEmployee(3333,"harshit",5.0,10000);
					
	        emp.add(e);
	        
	        emp.add(h);
	        
	        emp.add(c);
	        
	        for(Employee temp:emp)
	        {
	        	System.out.println("Employee id: "+temp.getEmployeeId());
	        	System.out.println("Employee name "+temp.getEmpname());
	        	System.out.println("Employee Salary "+temp.getEmployeeSalary());
	        	
	        	System.out.println("Want to increase the Weekly rate, hourly rate or Weekly sale  of the salaried employee? type y for yes");
	        	char ch=in.next().charAt(0);
	        	if(ch=='y') {
	        		temp.setEmployeeSalary(5);
	        	}
	        }
	        

	        
		
		
	}
}
