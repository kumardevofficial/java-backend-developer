package com.java.encapsulation;

public class Driver {

	public static void main(String[] args) {
		Payment payment = new Payment(500);
		
//		payment.balance= 3000;
//		System.out.println("Avialable balance :" + payment.getBalance());

		payment.doCredit(300);
		System.out.println("Avialable balance :" + payment.getBalance());
	}

}
