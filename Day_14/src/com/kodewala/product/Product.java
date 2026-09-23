package com.kodewala.product;

public class Product {

	String productName;
	double price;
	String description;
	int quantity;

	Product() {

	}

	Product(String _productName, double _price, String _description, int _quantity) {
		this.productName = _productName;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
	}

	Product(String _productName, String _description) {
		this.productName = _productName;
		this.description = _description;
	}

}
