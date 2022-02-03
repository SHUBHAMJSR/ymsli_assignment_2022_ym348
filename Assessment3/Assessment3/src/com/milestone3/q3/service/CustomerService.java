package com.milestone3.q3.service;

import com.milestone3.q3.persistence.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public Customer getByCustomerId(int id);
}
