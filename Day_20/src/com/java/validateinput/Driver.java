package com.java.validateinput;

import java.util.Scanner;

public class Driver {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int price = 0;
		System.out.println(" Pleaase enter the price...");
		// Before readig the interger, you are going to make sure that user supply an
		// int.
		if(sc.hasNextInt()) {
			price = sc.nextInt();
		} else 
		{
			System.out.println(" please enter the price in the right format");
		}
		System.out.println(" Price :"+ price);
		sc.close();	
	}
}
