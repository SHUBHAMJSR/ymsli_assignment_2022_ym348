package com.ymsli.Assignment2.question5;

class Convertible extends Car{
	
	public boolean isHoodOpen;
	
		public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}
		
		public void display()
		{
			super.display();
			if(isHoodOpen==true)
			{
				System.out.println("The hood is open.");
			}
			else
			{
				System.out.println("The hood is closed.");
			}
		}
}
