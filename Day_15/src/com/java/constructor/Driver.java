package com.java.constructor;

class Invoice extends Object {

	static int gst = 18;

	int amount;
	String intemName;
	String billingAddress;
	String customerId;
	String customerName;

	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName) {
		this.amount = _amount;
		this.intemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}

}

public class Driver {

	public static void main(String args[]) {
		Invoice inv1 = new Invoice(180000, "iphone 18", "BTM 1ST stage benglore", "IP00233", "Akshat");

		Invoice inv2 = new Invoice(50000, "vivo", "BTM banglore", "VIVO3234", "Vijay");

		System.out.println("Price of the Item is :" + inv1.amount + " \n Name of the Item is :" + inv1.intemName
				+ " \n Address for delivery is :" + inv1.billingAddress + " \n Customer Id is :" + inv1.customerId
				+ " \n Customer nams is :" + inv1.customerName + " \n Gst applied on the bill is :" + inv1.gst);

		System.out.println(" \n Price of the Item is :" + inv2.amount + " \n Name of the Item is :" + inv2.intemName
				+ " \n Address for delivery is :" + inv2.billingAddress + " \n Customer Id is :" + inv2.customerId
				+ " \n Customer nams is :" + inv2.customerName + " \n Gst applied on the bill is :" + inv2.gst);
	}
}
