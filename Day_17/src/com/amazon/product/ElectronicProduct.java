package com.amazon.product;

public class ElectronicProduct extends Product {
	
	int warranty;
	
	ElectronicProduct(String _name, int _price, String _productId, int _warranty){
		super(_name, _price, _productId);
		this.warranty = _warranty;
	}

}

