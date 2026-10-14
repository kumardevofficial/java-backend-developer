package com.java.bankaccount;

public class Driver {

	public static void main(String args[]) {
		BankAccount acc = new BankAccount("84748484", "Dev Kumar", 5500);
		
		System.out.println(acc.getBalance());
		acc.withdrawal(300);
		acc.withdrawal(-55);
		System.out.println(acc.getBalance());
		acc.deposite(-100);
		acc.deposite(300);
		System.out.println(acc.getBalance());
	}
}
