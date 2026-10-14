package com.java.mobilephone;

public class MobilePhone {

	private String brandName;
	private String model;
	private int batteryPercentage;
	private double price;
	
	MobilePhone(String brandName, String model, int batteryPercentage, double price){
		this.brandName = brandName;
		this.model = model;
		this.batteryPercentage = batteryPercentage;
		this.price = price;
	}
	
	public void setBatteryPercentage(int charge) {
		if(charge >= 0 && charge <= 100) {
			this.batteryPercentage = charge;
		}
	}
	
	public int getBatteryPercentage() {
		return this.batteryPercentage;
	}
}

//5. Mobile Phone
//Create a MobilePhone class with brand, model, batteryPercentage, and price.
//- Make the fields private.
//- Allow battery percentage only between 0 and 100.
//- Add a method to charge the battery without exceeding 100%.