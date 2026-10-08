package com.java.comapreeuqlsandmethods;

public class StringBuilderr {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("Aditya");
		sb.append("Kumar");
		System.out.println(sb);
		
		sb.insert(0, 'o');
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.replace(0, 3, "xy");
		System.out.println(sb);
		sb.reverse();
		sb.charAt(0);
		sb.setCharAt(0, 'r');
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		
	}

}
