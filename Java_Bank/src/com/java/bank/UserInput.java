package com.java.bank;

import java.util.Scanner;

public class UserInput {

	static int customerInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("================================\r\n" + "WELCOME TO JAVA BANK\r\n"
				+ "================================");
		System.out.println("1. Create Account\r\n" + "2. Login\r\n" + "3. Exit \n");
		System.out.print("Enter your choice: ");
		 int choice = sc.nextInt();
		 return choice;
	}

}

