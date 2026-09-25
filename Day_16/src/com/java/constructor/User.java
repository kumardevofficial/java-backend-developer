package com.java.constructor;

class SuperClass extends Object {
	
}

public class User extends SuperClass {

	String userName;
	String userId;
	String mobile;
	
	User(String _userName, String _userId, String _mobile)
	{
		
		this();
		this.userName= _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}
	
	User(){
		System.out.println("user no argument ");
	}

}
