package com.java.bank;

import java.util.Scanner;

public class AccountCreation {
	
	AccountDetails enterAccountDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n To create your bank account enter this details");

		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter your mobile Number:");
		String mobileNumber = sc.nextLine();

		System.out.println("Enter your pin:");
		int pin = sc.nextInt();

		System.out.println("Enter Deposit amount:");
		double deposit = sc.nextDouble();

		sc.nextLine(); 

		AccountDetails account = new AccountDetails(name, mobileNumber, pin, deposit);
		account.accountCreationMessage();
		return account;
		
	}
}
