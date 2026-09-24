package com.java.smartphone;

public class SmartPhone {

	public static void main(String args[])
	{
//		phone one object
		SmartPhoneDetails smPhone1 = new SmartPhoneDetails("xaomi", "xm222", "8GB", "225GB", 12000);
		smPhone1.showSpecification();
		
//		phone second objec
		SmartPhoneDetails smPhone2 = new SmartPhoneDetails("oppo","axo232", "16GB", "225GB", 16000);
		smPhone2.showSpecification();
	}
}


//String phoneBrand;
//String phoneModelNumber;
//String ramSize;
//String storage;
//double price;