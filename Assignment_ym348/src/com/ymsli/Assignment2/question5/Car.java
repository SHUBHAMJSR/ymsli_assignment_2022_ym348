package com.ymsli.Assignment2.question5;

class Car extends Vehicle{
	private int noOfDoor;
	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}

	
	public void display()
	{
		super.display();
		System.out.println("Number of door:"+noOfDoor);
	}


	public int getNoOfDoor() {
		return noOfDoor;
	}


	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}
	
}
