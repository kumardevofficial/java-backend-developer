package com.java.string;

public class Driver1 {

	public static void main(String args[]) {
		String s1 = "Akash";
		String s2 = "Kumar";
		
		String s3 = s1 + s2;
		
		String s4 = "AkashKumar";
		
		System.out.println(s3 == s4);
		
		System.out.println(s4 == s3.intern());
		
		String s5 = s3.intern();
		
		System.out.println(s5 == s4);
		
		// s4 -> AkashKumar
		//s3 --> head AkashKumar --> s3.inter() 
		
		
		
		
		
//		System.out.println(s4 == s3.intern());
	}
}
