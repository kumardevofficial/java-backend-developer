package com.java.makemytrip;

public class DiscountPolicy {

	double discountCalculation(double amount, double discountPercent) {
		
		if(((amount * discountPercent / 100)) > 1250) {
			return 1250;
		}
	    return  (amount * discountPercent / 100);
	}
}
