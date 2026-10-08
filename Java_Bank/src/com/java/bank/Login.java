package com.java.bank;

import java.util.Scanner;

public class Login {
	AccountDetails account;
	Login(AccountDetails _account){
		this.account = _account;
	}	
	
	 void customerLoging() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter account number :");
		String accountNumber = sc.nextLine();
		System.out.println(" Enter PIN: ");
		int pin = sc.nextInt();
		sc.nextLine();	
		
		if (this.account.accountNumber.equals(accountNumber) && this.account.pin == pin) {
		    System.out.println("authentication successful");
		    account.showAccountDetails();
		} else {
		    System.out.println("wrong input account details not matched");
		}
		
	}
}


