package com.java.learningscanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // creates connections with console
		
		System.out.println(" please enter the name...");
		String name = sc.nextLine(); // reading string input
		
		System.out.println("pls enter product price ...");
		int price = sc.nextInt(); // reading int --> this will leave new line char \n
		sc.nextLine(); // consume the extra char
		
		System.out.println("pls enter delivery address...");
		String address = sc.nextLine();
		
		
		System.out.println(" Nams is :" + name);
		System.out.println(" Price is :"+ price);
		System.out.println(" Address is :"+ address);
		
//		sc.close();  // this code will close the resource 
		
	}

}
