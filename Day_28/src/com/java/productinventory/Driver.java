package com.java.productinventory;

public class Driver {

	public static void main(String args[]) {
		Product product = new Product("Doll445", "Teady Bear", 500, 3);
		product.showProductDetials();
		product.setPrice(450);
		product.setSockQuantity(20);
		System.out.println("\n");
		product.showProductDetials();
	}
}
