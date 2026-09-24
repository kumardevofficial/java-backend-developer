package com.java.car;

public class Car {

	public static void main(String args[]) {
		CarDetails carObj = new CarDetails();
		System.out.println("This is just use for using the default constructor");

		CarDetails carObj1 = new CarDetails("TATA", "Naxon", 2016, 1200000);
		System.out.println("The car brand name is :" + carObj1.carBrand + "\n The car model number is :"
				+ carObj1.carModel + "\n The car Manufacturing year is :" + carObj1.carManufacturingYear
				+ "\n The car on road Price is :" + carObj1.carPrice);
		
		CarDetails carObj2 = new CarDetails("Mahindra", "Thar");
		System.out.println(
				"The car brand name is :" + carObj2.carBrand +
				"\n he car model number is :" + carObj2.carModel
				);
	}
}

//String carBrand;
//String carModel;
//int carManufacturingYear;
//double carPrice;