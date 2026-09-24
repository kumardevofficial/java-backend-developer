package com.java.account;

public class AccountDetails {

	private double accountBalance;
	String accountNumber;
	String accountHolderName;
	String branchName;
	
	AccountDetails(double _accountBalance, String _accountNumber, String _accountHolderName, String _branchName){
		this.accountBalance = _accountBalance;
		this.accountNumber = _accountNumber;
		this.accountHolderName = _accountHolderName;
		this.branchName = _branchName;		
	}
	
	double getBalance() {
		return this.accountBalance;
	}
	
	void setBalance(double _accountBalance)
	{
		this.accountBalance = this.accountBalance + _accountBalance;
	}
}


