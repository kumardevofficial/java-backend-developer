package com.java.account;

public class Account {

	public static void main(String[] args) {
		AccountDetails acc = new AccountDetails(550, "354675", "Dev kumar", "kumardhubi");

		System.out.println("Total Blance is :" + acc.getBalance() + "\n Account Number is :" + acc.accountNumber
				+ "\n Account Holder Name :" + acc.accountHolderName + "\n Branch Name :" + acc.branchName);
		
		//updating the account balance 
		
		acc.setBalance(-50);
		System.out.println("After updating the current balance is :" + acc.getBalance());
	}

}
