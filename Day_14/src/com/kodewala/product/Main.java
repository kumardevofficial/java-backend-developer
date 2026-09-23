package com.kodewala.product;

public class Main {

	public static void main(String[] args) {

		String productName = args[0];
		double price = Integer.parseInt(args[1]);
		String description = args[2];
		int quantity = Integer.parseInt(args[3]);

		Product product = new Product();  // object created wihtout any attribute
		System.out.println("this is default constructor call");

		Product product1 = new Product(productName, price, description, quantity); //object created with all attribute
		System.out.println(
				product1.productName + " " + product1.price + " " + product1.description + " " + product1.quantity);

		Product product2 = new Product(productName, description);   // object created with only two attribute
		System.out.println(product2.productName + " " + product2.description);

	}

}
