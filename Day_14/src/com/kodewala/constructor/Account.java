package com.kodewala.constructor;

public class Account {
	int amount;
	String name;
	
	Account()
	{
		System.out.println("inside Account()");
		}
	
	Account(int _amount, String _name)
	{
		System.out.println("inside Account(int _amount, String _name) ");
		this.amount = _amount;
		this.name = _name;
		
	}

}
