package com.swiggy.product;

public class DrinkableProduct extends Product {

	String type;
	double quantity;
	int shelfLife;
	
	DrinkableProduct(String _name, String _productId, String _expDate, String _mfdDate, String _type, double _quantity, int _shelfLife){
		super(_name, _productId, _expDate, _mfdDate);
		this.type = _type;
		this.quantity = _quantity;
		this.shelfLife = _shelfLife;
	}
	
	
	
	
}




