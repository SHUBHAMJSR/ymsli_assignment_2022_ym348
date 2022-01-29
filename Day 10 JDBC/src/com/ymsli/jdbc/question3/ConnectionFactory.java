package com.ymsli.jdbc.question3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

class ConnectionFactory {
	private static Connection connection=null;
	
	public static Connection getConnection()
	{
		//Read the database properties file
		Properties properties =new Properties();
		
		InputStream  inStream=null;
		
		try {
				inStream=new FileInputStream("C:\\Users\\ve00ym348\\Desktop\\ASSIGNMENTS_YM348\\Day 10 JDBC\\db.properties");
				properties.load(inStream);
			} 
		catch(IOException e){
				e.printStackTrace();
			}
		
		String url=properties.getProperty("jdbc.url");
		String userName=properties.getProperty("jdbc.username");
		String password=properties.getProperty("jdbc.password");
		String driverName=properties.getProperty("jdbc.driver");
		
		//loading a JDBC Driver
		try {
			Class.forName(driverName);
			System.out.println("The Driver is loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Get connection to the database
		
		try {
			connection=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection Done...!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return connection;
		
		
		
	}
}
