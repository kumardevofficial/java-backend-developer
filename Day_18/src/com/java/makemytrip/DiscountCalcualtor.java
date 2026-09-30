package com.java.makemytrip;

public class DiscountCalcualtor {

	DiscountPolicy discount = new DiscountPolicy();
	FinalFareCalculation finalFare = new FinalFareCalculation();
	
	void calculateDiscount(double amount) {
		if(amount < 5000) {
			System.out.println(" The amount is less then 5000 you won't get any discount");
		} else if(amount > 5000 && amount < 10000) {
			System.out.println("you are eligible for the discount amount :"+ " \n Before discount amount :"+ amount + " \n After discount : " + finalFare.finalCalculation(amount, 10) + "\n Total Discount amount is :"+ discount.discountCalculation(amount, 10));
		} else if(amount > 10000) {
			System.out.print("you are eligible for the discount amount :"+ " \n Before discount amount :"+ amount + "\n After discount : " + finalFare.finalCalculation(amount, 15) + " \n Total Discount amount is :"+ discount.discountCalculation(amount, 10));
		}
	}

}




