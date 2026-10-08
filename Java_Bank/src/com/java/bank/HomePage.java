package com.java.bank;

import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) {
		
		UserInput userInput = new UserInput();
		AccountCreation accountCreation = new AccountCreation();
		AccountDetails[] allAccount = new AccountDetails[3];

		int choice = userInput.customerInput();
		if(choice == 3) System.out.println(" thanks for using java bank");
		

	   while(choice != 3) {
		   
		   	if(choice == 1) {
		   		allAccount[0] = accountCreation.enterAccountDetails();
		   	} else if(choice ==2 ) {
		   		Login account  = new Login(allAccount[0]);
		   		account.customerLoging();
		   	} 
		   	choice = userInput.customerInput();
		   	if(choice == 3) System.out.println(" thanks for using java bank");
	   }

	}
	


}
