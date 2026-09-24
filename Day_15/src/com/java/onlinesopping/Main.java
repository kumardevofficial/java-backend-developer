package com.java.onlinesopping;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Alok Pandey", "Banglore", 1000000);
//		customer.displayCustomerDetails();
		
		Product product = new Product("Iphone", 180000, "electornics");
//		product.showProductInfo();
		
		Order order = new Order("IPH00324", 3, customer, product);
		order.checkOut();

	}

}


