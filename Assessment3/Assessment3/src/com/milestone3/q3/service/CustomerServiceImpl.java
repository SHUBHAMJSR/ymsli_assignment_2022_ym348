package com.milestone3.q3.service;

import java.sql.Date;

import com.milestone3.q3.persistence.Customer;
import com.milestone3.q3.persistence.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDaoImpl customerdao;
	public CustomerServiceImpl()
	{
		customerdao=new CustomerDaoImpl();
	}
	@Override
	public void addCustomer(Customer customer) {
		customerdao.addCustomer(new Customer("Naveen","Mumbai","9081717111",new Date(2000-03-01)));
	}

	@Override
	public Customer getByCustomerId(int id) {
		return customerdao.getByCustomerId(1);
	}

}
