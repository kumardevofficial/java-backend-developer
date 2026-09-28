package com.java.savingaccount;

public class BankAccount {

	String accountNumber;
	String holderName;
	double balance;
	
	BankAccount(String _accountNumber, String _holderName, double _balance){
		this.accountNumber = _accountNumber;
		this.holderName = _holderName;
		this.balance = _balance;
	}
	
	BankAccount(){
		this("00000000", "unknown", 00.00);
	}
	
	BankAccount(String _accountNumber){
		this(_accountNumber, "unknown", 00.00);
	}
	
	BankAccount(String _accountNumber, String _holderName){
		this(_accountNumber, _holderName, 00.00);
	}
}


