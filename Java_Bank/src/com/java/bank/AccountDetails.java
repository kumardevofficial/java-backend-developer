package com.java.bank;

import java.util.Scanner;

public class AccountDetails {
	
	Scanner sc = new Scanner(System.in);

	String name;
	String mobileNumber;
	int pin;
	private double deposit;
	String accountNumber;
	
	AccountDetails(String name, String mobileNumber, int pin, double deposit){
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.pin = pin;
		this.deposit = deposit;
		this.accountNumber = mobileNumber + pin;
		
	}
	
	
	void showAccountDetails() {
		System.out.println("Account Details ");
		System.out.println("Account name :"+ this.name);
		System.out.println("Moible Number :"+ this.mobileNumber);
		System.out.println("Available balance :"+ this.deposit);
		System.out.println("Account Number :"+ this.accountNumber);

	}
	
	void accountCreationMessage() {
		System.out.println("\n Your account has been successfully created");
		System.out.println(" Your account Number is :" + this.accountNumber + "\n");
	}
	
}

