package com.milestone3.q3.controller;

import java.sql.Date;

import com.milestone3.q3.persistence.Customer;
import com.milestone3.q3.service.CustomerService;
import com.milestone3.q3.service.CustomerServiceImpl;

public class CustomerTester {
	public static void main(String[] args) {
		
		System.out.println("-----Add the customer-----");
		Customer customer=new Customer("Naveen","Mumbai","9908765489",new Date(1990-01-02));
		CustomerService customerService=new CustomerServiceImpl();
		customerService.addCustomer(customer);
		
		System.out.println("-----Finding customer by id=1--------");
		Customer customer1=customerService.getByCustomerId(1);
		System.out.println(customer1);
	}
}
