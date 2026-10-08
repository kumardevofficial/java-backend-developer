package com.java.string;

class User {
	String name;

	public User(String name) {
		super();
		this.name = name;
	}
}

public class Driver1 {

	public static void main(String[] args) {

		String city1 = "Banglore";
		String city2 = "Banglore";
		String city3 = "Banglore";
		String city4 = "Banglore";
		String city5 = "Banglore";

		System.out.println(city1.equals(city2));

		User user1 = new User("Jharkhand");
		User user2 = new User("Jharkhand");

		System.out.println(user1.equals(user2));
		System.out.println(user1 == user2);
	}

}
