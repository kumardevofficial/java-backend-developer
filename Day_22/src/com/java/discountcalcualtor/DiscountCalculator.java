package com.java.discountcalcualtor;

public class DiscountCalculator {

	public void calculateDiscoutn(double amount, int customerType) {
		if (amount > 1000) {
			switch (customerType) {
			case 1:
				System.out.println("Total Fare : " + amount + " \n Total discount : 20 % " + " \n You have pay only "
						+ (amount - percentageCalcualte(amount, 20)));
				break;
			case 2:
				System.out.println("Total Fare : " + amount + "\n Total discount : 10 % " + "\n You have pay only "
						+ (amount - percentageCalcualte(amount, 10)));
				break;
			case 3:
				System.out.println("Total Fare : " + amount + "\n Total discount : 5 % " + "\n You have pay only "
						+ (amount - percentageCalcualte(amount, 5)));
				break;
			default:
				System.out.println(" unable to calcualte the discount because the customer type is invalid");
				break;
			}
		} else {

			System.out.println("To get discount, the minimmum purchase amount should be greater then 1000");
		}
	}

	
	double percentageCalcualte(double amount, int percentage) {
			if(((percentage * amount) / 100) > 2500) {
				return 2500;
			} else {
				return (percentage * amount) / 100;
			}
	}


}
