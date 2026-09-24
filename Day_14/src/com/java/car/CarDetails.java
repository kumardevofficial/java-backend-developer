package com.java.car;

public class CarDetails {
 
	String carBrand;
	String carModel;
	int carManufacturingYear;
	double carPrice;
	
	CarDetails()  // this is called default constructor 
	{
		
	}
	
	CarDetails(String _carBrand, String _carModel, int _carManufacturingYear, double _carPrice) // this constructor with all the arguments
	{
		this.carBrand = _carBrand;
		this.carModel = _carModel;
		this.carManufacturingYear = _carManufacturingYear;
		this.carPrice = _carPrice;
	}
	
	CarDetails(String _carBrand, String _carModel)
	{
		this.carBrand = _carBrand;
		this.carModel = _carModel;
	}
}


