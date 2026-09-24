package com.java.onlinesopping;

public class Customer {

	String customerName ;
	String customerCity;
	private double walletBalance;
	
	Customer(String _customerName, String _customerCity, double _walletBalance){
		this.customerName = _customerName;
		this.customerCity = _customerCity;
		this.walletBalance = _walletBalance;
	}
	
	double showWalletBalance() { return this.walletBalance; }
	
	void updateWalletBalance(double updateBalance) {
		this.walletBalance = updateBalance;
	}
	
	void displayCustomerDetails()
	{
		System.out.println(
				" \n Customer Name :"+ this.customerName+
				" \n Customer City :"+ this.customerCity +
				" \n Customer wallet Balance :"+ this.walletBalance
				);
	}
	
}

