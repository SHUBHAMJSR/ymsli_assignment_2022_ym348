package com.ymsli.day4.assignment.queston3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Employee obj1=new Employee("shubham","11","Delhi",50000);
		
		String filename = "C:\\Users\\ve00ym348\\Desktop\\ASSIGNMENTS_YM348\\Day4\\src\\com\\ymsli\\day3\\assignment\\queston3\\emp.txt";
		
		 try
	        {   
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	              
	            // Method for serialization of object
	            out.writeObject(obj1);
	              
	            out.close();
	            file.close();
	              
	            System.out.println("Object has been serialized");
	            obj1.display();
	        }
		 catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
		 
		 
		 Employee obj2=null;
		// Deserialization
	        try
	        {   
	            // Reading the object from a file
	            FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);
	              
	            // Method for deserialization of object
	            obj2 = (Employee)in.readObject();
	              
	            in.close();
	            file.close();
	            obj2.salary=40000;
	            System.out.println("Object has been deserialized ");
	            obj2.display();
	        }
	        
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	          
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	        }
		

	}
}
