package com.java.ecommercecheckout;

public class Customer {

	String name;
	double walletBalance;
	
	Customer(String name, double walletBalance){
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	void updateWallet(double updateBalance){
		this.walletBalance = updateBalance;
	}
}


