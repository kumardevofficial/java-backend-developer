package com.java.ecommercecheckout;

public class Order {

	String orderId;
	Customer customer;
	Product product;
	int quantity;
	
	Order(String orderId, Customer customer, Product product, int quantity){
		this.orderId  = orderId;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}
	
	double totalPayableAmount(double productPrice, int quantity) {
		return  productPrice * quantity;
	}
	
	boolean orderValueChecker(double payableAmount) {
		if(payableAmount >= 50000) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean walletBalanceChecker(double productPrice, int quantity) {
		if(totalPayableAmount(productPrice, quantity) < customer.walletBalance ) {
			return true;
		} else {
			return false;
		}
	}
	
	void updateWalletBalance(double payableAmount) {
		
		customer.updateWallet(payableAmount - customer.walletBalance);
	}
	
	void checkOut(double price, int quantity) {
		double totalPayableAmount = totalPayableAmount(price, quantity);
		if(walletBalanceChecker(price, quantity)) {
			if(orderValueChecker(totalPayableAmount)) {
				System.out.println(" it's  high value order");
				System.out.println("Total payable amount is :" + totalPayableAmount);
				updateWalletBalance(totalPayableAmount);
				System.out.println("Current wallet balance is :" + customer.walletBalance );
			} else {
				System.out.println(" it's  regular order");
				System.out.println("Total payable amount is :" + totalPayableAmount);
				updateWalletBalance(totalPayableAmount);
				System.out.println("Current wallet balance is :" + customer.walletBalance );
			}
		} else {
			System.out.println("you do not have sufficient wallet balance to make this payment");
		}
	}
}
