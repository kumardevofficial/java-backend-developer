package com.java.string;



public class Driver {

	public static void main(String[] args) {

		String s1 = "Jharkhand"; // SCP --> 123que
		String s2 = new String("Academy"); // one object in scp + one in heap
		 
		System.out.println(s1 == s2); // 123qwe == s32vcx --> false
		
		String s3 = new String("Jharkhand");
		String s4 = new String("Jharkhand");
		
		System.out.println(s4 == s3);
		System.out.println(s4.equals(s3));
		

	}

}
