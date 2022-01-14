package com.ymsli.Assignment2.question2.question1;

class Circle {
	
	private double radius;
	private String color="red";
	
	public Circle()
	{
		radius=0.0;
	}
	public Circle(double r)
	{
		radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return(3.14*radius*radius);
	}
	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
class Question1
{
	public static void main(String args[])
	{
		
		Circle c1=new Circle();
		System.out.println("The radius of a Circle is: "+c1.getRadius());
		System.out.println("The area of the Circle is: "+c1.getArea());
		System.out.println("The color of the Circle is:"+c1.getColor());
		
		Circle c2=new Circle(5.0);
		System.out.println("The radius of the Circle is" +c2.getRadius());
		System.out.println("The area of the Circle is: "+c2.getArea());
		System.out.println("The color of the Circle is:"+c2.getColor());
	}
}
