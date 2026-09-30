package com.java.ecommercecheckout;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Dev Kumar", 100000);
		Product product = new Product("samsung galaxy s24", 55000, "electronics");
		Order order = new Order("ORDER2234", customer, product, 1);
		order.checkOut(product.price, order.quantity);
	}

}
