package com.java.usecaseoffiib;

public class Driver {

	public static void main(String args[]) {
		for(int i=0; i<1000; i++) {
			User user = new User("de12", "dev kumar", "free");
		}
		
		System.out.println("current live user count is :" + User.liverUserCount);
	}
}
