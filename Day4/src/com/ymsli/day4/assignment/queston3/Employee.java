package com.ymsli.day4.assignment.queston3;

import java.io.Serializable;

public class Employee implements Serializable {
	
	String name,id;
	String address;
	transient double salary;
	
	
	
	public Employee(String name, String id, String address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}



	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Address: "+address);
		System.out.println("Salray: "+salary);
	}
}
