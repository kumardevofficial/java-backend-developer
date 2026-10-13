package com.java.learnstatic;

public class User {
	String userName;
	String userId;
	String mobileNumber;
	
	// static block will get executed just after the class loading
	static 
	{
		System.out.println("i am in static init block1");
	}
	
	static 
	{
		System.out.println("i am in static init block2");
	}
	
	public User(String userName, String userId, String mobileNumber)
	{
		super();
		System.out.println(" User.user().(\"dev kumar\", \"dev124\", \"3456789\")");
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}

}
