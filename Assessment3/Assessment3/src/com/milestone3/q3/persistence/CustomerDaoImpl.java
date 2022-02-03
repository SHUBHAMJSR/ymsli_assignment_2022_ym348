package com.milestone3.q3.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.milestone3.q3.Exception.CustomerNotFoundException;

public class CustomerDaoImpl implements CustomerDao{

	Connection connection = ConnectionFactory.getConnection();
	public void addCustomer(Customer customer)
	{
		try {
			PreparedStatement pstmt=connection.prepareStatement(" insert into Customer(name,address,phoneNumber,dob) values(?,?,?,?)");
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhoneNumber());
			pstmt.setDate(4,customer.getDob());

			pstmt.executeUpdate();
			System.out.println("Records updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Customer getByCustomerId(int id)
	{
		Customer customer=null;
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from Customer where id=?");
			pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
			customer=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5));
			}
			else
			{
				throw new CustomerNotFoundException("Customer not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (CustomerNotFoundException e) {
			e.printStackTrace();
		}
		
		return customer;
	}
}
