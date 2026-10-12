package com.java.classtest;

public class Driver1 {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = new String("java");
		String s3 = new String("Java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
