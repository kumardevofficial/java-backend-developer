package com.flipkart.user;

public class User {

	String name;
	String country;
	String type;
	String mobileNumber;
	
	User(String _name, String _country, String _type, String _mobileNumber){
		this.name = _name;
		this.country = _country;
		this.type = _type;
		this.mobileNumber = _mobileNumber;
		}
	
	User(){
		this("guest112", "IN", "guest_user", "785738457");
	}
	
	void userDetails() {
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.type);
		System.out.println(this.mobileNumber);
	}
}
