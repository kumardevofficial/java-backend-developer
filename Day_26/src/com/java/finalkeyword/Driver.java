package com.java.finalkeyword;

class AccountMgmt { // if we use final in class level the class can not become parent
	final int UPI_LIMIT = 100000;
	
	public final void doSomething() {
		//UPI_LIMIT = 200000; // not able to change teh valjues 
	}
	
	public void doSomething2() {
		// some func.... android
	}
}

class Account extends AccountMgmt{
	
	@Override
	public void doSomething2() {
		// overriding the existing method
	}
}

public class Driver {

	public static void main(String[] args) {

		
	}

}
