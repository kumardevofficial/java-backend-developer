package com.java.deepunderstanding;

public class InstanceAndStatic {
	
	String name;
	
	static {
		System.out.println("Hi i am static block");
	}
	
	{
		System.out.println(" Hi i am instance block");
	}
	
	InstanceAndStatic(String name){
		this.name = name;
		System.out.println(" hi i am inside constructor ");
	}

}
