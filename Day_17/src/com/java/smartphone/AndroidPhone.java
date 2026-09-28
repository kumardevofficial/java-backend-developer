package com.java.smartphone;

public class AndroidPhone extends SmartPhone {

	String androidVersion;
	String storage;
	
	AndroidPhone(){
		this("XXBRANDXX", "XXMODELXX", 00.00, "XXVER", "XGB");

	}
	
	AndroidPhone(String brand){
		this(brand, "XXMODELXX", 00.00, "XXVER", "XGB");
	};
	
	AndroidPhone(String brand, String model){
		this(brand, model, 00.00, "XXVER", "XGB");
	}
	
	AndroidPhone(String brand, String model, double price, String androidVersion, String storage){
		super(brand, model, price);
		this.androidVersion = androidVersion;
		this.storage = storage;
	}
}

