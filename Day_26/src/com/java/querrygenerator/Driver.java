package com.java.querrygenerator;

public class Driver {

	public static void main(String[] args) {

		QuerryGenerator query = new QuerryGenerator();
		
		StringBuilder myquery = query.generateQuerry(1200, "dev123");
		
		System.out.println(myquery);

	}

}
