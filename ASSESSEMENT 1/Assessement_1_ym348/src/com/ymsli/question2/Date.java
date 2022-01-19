package com.ymsli.question2;
import java.util.*;
public class Date {
	private int day,month,year;

	public Date()
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Day, Month and Year");
		int dd=in.nextInt();
		int mm=in.nextInt();
		int yyyy=in.nextInt();
		in.close();
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public void print()
	{
		System.out.println(toString());
	}
}
