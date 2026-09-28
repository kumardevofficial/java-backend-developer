package com.java.vehicle;

public class Car extends Vehicle {

	int numberOfDoors;
	String fuelType;
	
	Car(String brand, String model, double price, int numberOfDoors, String fuelType){
		super(brand, model, price);
		this.numberOfDoors = numberOfDoors;
		this.fuelType = fuelType;
	}
	
	Car(){
		this("XXXUNK", "XXXMOD", 00.00, 0, "petrol") ;
	}
	
	void showCarDetails() {
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.price);	
		System.out.println(this.numberOfDoors);
		System.out.println(this.fuelType);
	}
	
}
