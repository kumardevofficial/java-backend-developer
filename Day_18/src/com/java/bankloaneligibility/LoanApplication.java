package com.java.bankloaneligibility;

public class LoanApplication {

	String applicationId;
	double loanAmount;
	Customer customer;
	
	LoanApplication(String applicationId, double loanAmount, Customer customer){
		this.applicationId = applicationId;
		this.loanAmount = loanAmount;
		this.customer = customer;
	}
	
	String checkLoanEligibility() {
		if(customer.creditScore > 700) {
			if(customer.monthlyIncome > 30000) {
				return "your loan is approved";
			} else {
				return "your credit score is ok but your montly income is below 30000";
			}
		} else {
			return "you credit score is below 700";
		}
	}
}


