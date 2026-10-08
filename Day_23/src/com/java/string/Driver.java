package com.java.string;

public class Driver {

	public static void main(String[] args) {

		String s1 = "Jharkhand"; // obj created in SCP --> s1 adress
		String s2 = "Jharkhand"; // Object with content "Kodewala" already created and s2 willl reffere to existing object s2 is also pointing to address xyz321
		System.out.println(s1 == s2); // true
		
		String s3 = "Jharkhand";
		String s4 = "Jharkhand";
		System.out.println(s3 == s4); // false
	}

}
