package com.java.usecaseoffiib;

public class User {
	
	String userId;
	String userName;
    String type;
    public static int liverUserCount = 0;
    
    public User(String userId, String userName, String type) {
    	super();
    	this.userId = userId;
    	this.userName = userName;
    	this.type = type;
    }
    
    // IIB 
    {
    	liverUserCount = liverUserCount +1;
    }
    

}

