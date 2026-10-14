package com.java.productinventory;

public class Product {

	private String productId;
	private String productName;
	private double price;
	private int stockQuantity;

	Product(String productId, String productName, double price, int stockQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	
	public void setPrice(double _price) {
		if (_price > 0) {
			this.price = _price;
		}
	}

	public void setSockQuantity(int stockQuantity) {
		if (stockQuantity > 0) {
			this.stockQuantity = stockQuantity;
		}
	}

	public void showProductDetials() {
		System.out.println("The product Id is :" + this.productId + "\n The product Name is :" + this.productId
				+ "\n The price of the product is :" + this.price + "\n The stock quantity is :" + this.stockQuantity);
	}
}

//4. Product Inventory
//Create a Product class with productId, productName, price, and stockQuantity.
//- Prevent negative prices and stock.
//- Add methods to increase and decrease stock.
//- Prevent stock from becoming negative.
//Practise: protecting object state.