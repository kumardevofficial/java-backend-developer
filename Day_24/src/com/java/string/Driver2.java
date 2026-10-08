package com.java.string;

public class Driver2 {

	public static void main(String[] args) {

		String s = "Jharkhand"; // SCP 
		// in case i want to change s
		
		 s = s.concat(" state"); // trying to change the object 
		 					// object created in heap with content Jharkhand Academy 
		
		System.out.println(s);
		
		String fullName = "Ajay";
		fullName = "Ajay" + " Kumar";  // Ajay , Kumar , Ajay Kumar
		
		System.out.println(fullName);
	}

}


              