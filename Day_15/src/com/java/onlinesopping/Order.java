package com.java.onlinesopping;

public class Order {

	String orderId;
	Customer customer;
	Product product;
	int quantity;
	
	Order(String _orderId, int _quantity, Customer _customer, Product _product){
		this.orderId = _orderId;
		this.quantity = _quantity;
		this.customer = _customer;
		this.product = _product;
	}
	
	double isWalletBalanceSufficient(int quantity) {
		double balance = customer.showWalletBalance();
		
		return (balance> quantity * product.productPrice) ? balance : -1;	

	}
	
	
	
	void updateWalletBalance(int quantity) {
		double  leftAmount = customer.showWalletBalance() - (quantity * product.productPrice) ;
		customer.updateWalletBalance(leftAmount);
	}
	
	
	
	void checkOut() {
		customer.displayCustomerDetails();
		product.showProductInfo();
//		System.out.println(isWalletBalanceSufficient(this.quantity));
		if(isWalletBalanceSufficient(quantity) != -1) {
			System.out.println(
					" \n Your order Id :" + this.orderId +
					" \n Total quantity :" + this.quantity 	);
			updateWalletBalance(quantity);
			System.out.println(" \n Transcation completed you paid :" + (product.productPrice * this.quantity));
			System.out.println(" \n You wallet balance :" + customer.showWalletBalance());
		} else {
			System.out.println(" \n you do not have sufficient balance to make this payment");
			System.out.println(" \n Amount need to completed the transcation :" + (product.productPrice * this.quantity));
			System.out.println(" \n you current wallet balance is :" + customer.showWalletBalance());
			
		}
		

	}
	
	
	
}

