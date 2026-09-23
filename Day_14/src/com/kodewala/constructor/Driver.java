package com.kodewala.constructor;

public class Driver {

	public static void main(String args[])
	{
		Account acc = new Account();
		
		System.out.println(acc.amount + " and " + acc.name);
		
		Account acc1 = new Account(500, "ajay");
		
		System.out.println(acc1.amount + " and " + acc1.name);
		
	}
}
