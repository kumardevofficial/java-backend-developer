package com.java.smartphone;

public class SmartPhoneDetails {

	String phoneBrand;
	String phoneModelNumber;
	String ramSize;
	String storage;
	double price;

	SmartPhoneDetails(String _phoneBrand, String _phoneModelNumber, String _ramSize, String _storage, double _price) {

		this.phoneBrand = _phoneBrand;
		this.phoneModelNumber = _phoneModelNumber;
		this.ramSize = _ramSize;
		this.storage = _storage;
		this.price = _price;
	}
	
	void showSpecification()
	{
		System.out.println(
				" Phone brand name is :"+ this.phoneBrand +
				" \n Phone Model Number is " + this.phoneModelNumber +
				" \n Phone Ram size is" + this.ramSize +
				" \n Phone Store is " + this.storage +
				" \n Phone price is" + this.price + "\n"
				);
	}
}
