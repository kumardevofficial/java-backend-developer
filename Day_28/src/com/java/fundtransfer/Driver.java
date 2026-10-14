package com.java.fundtransfer;

public class Driver {

	public static void main(String[] args) {

		Account account  = new Account("dev kumar", "3456787667", 5000);
		
		account.getAccountDetails();
		System.out.println("\n");
		account.doCredit(5000);
		System.out.println("available balance : " + account.getBalance());
		account.doDebit(-300);
		System.out.println("available balance : " + account.getBalance());
		account.doDebit(10000);
		System.out.println("available balance : " + account.getBalance());
		account.doCredit(-500);
		System.out.println("available balance : " + account.getBalance());
		account.doCredit(300);
		System.out.println("available balance : " + account.getBalance());
		System.out.println("\n");
		account.getAccountDetails();
		
		
	}

}