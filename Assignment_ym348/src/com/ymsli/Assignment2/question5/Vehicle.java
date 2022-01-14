package com.ymsli.Assignment2.question5;

class Vehicle {

	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;
	
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {

		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}


	
	public void display()
	{
		System.out.println("noOfWheel=" + noOfWheel + ", noOfPassenger=" + noOfPassenger + ", model=" + model + ", make="
				+ make );
	}
}
