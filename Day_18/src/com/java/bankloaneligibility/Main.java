package com.java.bankloaneligibility;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer("DEVKKID", "DEV KUMAR", 29000, 747);
		LoanApplication loanApp = new LoanApplication("LOANID334", 200000, customer);
		System.out.println(loanApp.checkLoanEligibility());
		

	}

}
