package com.ymsli.question2;
import java.util.*;
public class Owner extends Date{
	
	private String name;
	private Date dateOfBirth;
	private String nic;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNic() {
		return nic;
	}


	public void setNic(String nic) {
		this.nic = nic;
	}



	public Owner(String name, Date dateOfBirth, String nic) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nic = nic;
	}
	
	public Owner(Owner o)
	{
		
	}
	public void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the Owner details: name, Date-of-birth,nic");
		String name=in.nextLine();
		super.input();
		String s=in.nextLine();
	}


	@Override
	public String toString() {
		return "Owner [name=" + name + ", dateOfBirth=" + dateOfBirth + ", nic=" + nic + "]";
	}
	
	public void print()
	{
		System.out.println(toString());
	}
	
	
	
}
