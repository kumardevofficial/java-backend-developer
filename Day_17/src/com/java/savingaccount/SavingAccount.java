package com.java.savingaccount;

public class SavingAccount extends BankAccount {

	double interestRate;
	
	SavingAccount(){
		this("000000", "unknown", 00.00 , 5);
		
	}
	
	SavingAccount(String _accountNumber, String _holderName){
		this(_accountNumber, _holderName , 000, 5 );
		
	}
	
	SavingAccount(String _accountNumber, String _holderName, double _balance, double _interestRate){
		super(_accountNumber, _holderName, _balance);
		this.interestRate = _interestRate;
	}
	
	void showSavingAccountDetails() {
		System.out.println(this.accountNumber);
		System.out.println(this.holderName);
		System.out.println(this.balance);
		System.out.println(this.interestRate);
		
	}
}
