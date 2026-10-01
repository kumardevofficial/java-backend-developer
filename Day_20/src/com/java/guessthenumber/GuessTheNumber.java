package com.java.guessthenumber;

import java.util.Scanner;

public class GuessTheNumber {

	//between 0 to 100
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luckNumber = 13;
		int userEntered = 0;
		
		while(luckNumber != userEntered) {
			
			System.out.println(" please enter the number...");
			userEntered = sc.nextInt();
		
			if(userEntered == luckNumber) {
				System.out.println(" you won !!");
			} else {
				System.out.println(" please try again..");
			}
			
		}
		
		
		
	}

}
