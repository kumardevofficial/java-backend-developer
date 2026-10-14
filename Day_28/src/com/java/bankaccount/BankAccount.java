package com.java.bankaccount;

public class BankAccount {
 
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	BankAccount(String accountNumber, String accountHolderName, double balance){
		this.accountHolderName = accountNumber;
		this.accountHolderName  = accountHolderName;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		if(amount > 0) {
			this.balance += amount;
		} else {
			System.out.println(" The deposite amount should be greater then 0");
		}
		
	}
	
	public void withdrawal(double amount) {
		if(amount > 0 && amount <= balance) {
			this.balance -= amount;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
}


//2. Bank Account
//Create a BankAccount class with accountNumber, accountHolder, and balance.
//- Initialize the account through a constructor.
//- Do not allow direct balance modification.
//- Add deposit and withdrawal methods.
//- Reject non-positive amounts and withdrawals exceeding the balance.