package com.spcore.forms;

public class Bus implements Vehicle {
	private int noOfSeats;
	private int maxSpeed;
	
	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("No. of Seats: "+getNoOfSeats());
		System.out.println("Maximum Speed: "+getMaxSpeed());
		System.out.println("Bus Started.");
	}

}
