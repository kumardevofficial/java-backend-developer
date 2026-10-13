package com.java.stringbuilder;

public class Driver1 {

	public static void main(String[] args) {
		
		String s = new String("Ja") + new String("va");
		s.intern();  
		String s1 = "Java"; 
		System.out.println(s == s1);
		
		
		String s2 = new String("He") + new String("llo");
		String s3 = "Hello"; 
		s2.intern();  
		System.out.println(s2 == s3);

	}

}
