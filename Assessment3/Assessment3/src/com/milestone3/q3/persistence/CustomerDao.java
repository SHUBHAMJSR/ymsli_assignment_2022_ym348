package com.milestone3.q3.persistence;

/*
 * Q2. Write a program to add Customer and find customer by id  to a table
field of customer table :id, name,address, phone number, dob.
While coding consider following factors:
1. Implement DAO, DTO pattern
2. Using exception wrappring and rethrowning
3. Create connection factory, read connection details from a property file, in order to
have loose coupling
*/
public interface CustomerDao {
	public void addCustomer(Customer customer);
	public Customer getByCustomerId(int id);
}
