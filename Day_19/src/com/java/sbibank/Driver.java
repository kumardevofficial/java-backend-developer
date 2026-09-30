package com.java.sbibank;

public class Driver {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Alok", 5500, "65656656");
		Customer customer2 = new Customer("vikas", 300, "3647475575");
		Customer customer3 = new Customer("akash", 400, "5475475487");
		Customer customer4 = new Customer("mukesh", 6000, "465657676");
		
		Customer[] customer = new Customer[4];
		
		customer[0] = customer1;
		customer[1] = customer2;
		customer[2] = customer3;
		customer[3] = customer4;
		
		
		for(int index=0; index<customer.length; index++) {
			if(customer[index].accountBalance < 2000)
			{
				System.out.println("The Customer name is :" + customer[index].customerName);
			}
		}
		
		
		
		

	}

}
