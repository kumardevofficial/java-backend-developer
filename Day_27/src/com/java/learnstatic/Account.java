package com.java.learnstatic;

class AccountMgmt{
	public AccountMgmt() {
		System.out.println(" AccountMgmt.AccountMgmt()...");
	}
}

public class Account extends AccountMgmt{

	String accountNumber;	
	public Account(String accountNumber) {
		super(); //1st line
		//call to init block --> IIB --> 2nd line
		System.out.println("Account(String accountNumber)");
		this.accountNumber = accountNumber;
	}
	
	//Instance Init block --> This will get executed whenever  object is created 
	{
		System.out.println(" Account IIB");
	}
}
