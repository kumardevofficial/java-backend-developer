package com.java.fundtransfer;

public class Account {

	private String accountHolderName;
	private String accountNumber;
	private double accountBalance;
	
	Account(String _accountHolderName, String _accountNumber, double _accountBalance){
		this.accountHolderName = _accountHolderName;
		this.accountNumber= _accountNumber;
		this.accountBalance = _accountBalance;
	}
	
	public void doCredit(double amount) {
		if(amount > 0) {
			this.accountBalance += amount;
		}
	}
	
	public void doDebit(double amount) {
		if(amount <= accountBalance && amount > 0) {
			this.accountBalance -= amount;
		}
	}
	
	public double getBalance() {
		return this.accountBalance;
	}
	
	public void getAccountDetails() {
		System.out.println("Account Holder Name :" + this.accountHolderName);
		System.out.println("Account number is :" + this.accountNumber);
		System.out.println("Avaiable balnce :" + this.accountBalance);
	}
}
