package com.qa.tests;


interface Vehicle{
	
	void startEngine();
}

public class ElectricCar implements Vehicle {

	@Override
	public void startEngine() {

		System.out.println("Engine started silently via Battery.");
	}
	
}


