package com.amazon.product;

public class Driver {

	public static void main(String[] args) {
		ElectronicProduct obj = new ElectronicProduct("iphone",  120000, "45xfs", 5);
		System.out.println(obj.name);
		System.out.println(obj.price);
		System.out.println(obj.productId);
		System.out.println(obj.warranty);
		

	}

}
