package com.java.discountcalcualtor;

public class Driver {

	public static void main(String[] args) {
		DiscountCalculator discount = new DiscountCalculator();
		//1 gold customer, 2 silver customer , 3 regular customer 
		discount.calculateDiscoutn(15000, 1);
	}

}
