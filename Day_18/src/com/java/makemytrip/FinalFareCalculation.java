package com.java.makemytrip;

public class FinalFareCalculation {

	DiscountPolicy discount = new DiscountPolicy();
	
	double finalCalculation(double amount, double discountPercent) {
		return amount - discount.discountCalculation(amount, discountPercent);
	}
	
}
