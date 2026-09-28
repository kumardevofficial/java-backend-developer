package com.java.smartphone;

public class SmartPhone {

	String brand;
	String model;
	double price;
	
	SmartPhone(){
		this("XXBRANDXX", "XXMODELXX", 00.00);
	}
	
	SmartPhone(String brand, String model){
		this(brand, model, 00.00);
	}

	SmartPhone(String brand){
		this(brand, "XXMODELXX", 00.00 );
	}
	
	SmartPhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void showBasicDetails() {
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.price);
	}
	
}
