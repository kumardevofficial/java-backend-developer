package com.java.vehicle;

public class Vehicle {
	String brand;
	String model;
	double price;
	
	Vehicle(){
		this("XXXUNK", "XXXMOD", 00.00);
	}
	
	Vehicle(String brand){
		this(brand, "XXXMOD", 00.00);
	}
	
	Vehicle(String brand, String model){
		this(brand, model, 00.00);
	}
	
	Vehicle(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void showVehicleDetails() {
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.price);	}
	
}


