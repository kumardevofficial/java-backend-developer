package com.java.deepunderstanding;

class Hello{
	
	static int count=0;
	
	static {
		System.out.println(" hello ji");
	}
	
	{
		System.out.println(" hi this is");
		count++;
	}
}


public class StaticAndInstance {

	public static void main(String[] args) {

		for(int i = 0; i<5; i++) {
			Hello hello = new Hello(); 
		}
		
		System.out.println(Hello.count);

	}

}
