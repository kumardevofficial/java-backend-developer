package com.java.encapsulation;

public class Payment {

//	int balance;
	private int balance;
	
	public Payment(int _balance) {
		this.balance = _balance;
	}
	
	public void doCredit(int _balance) {
		if(_balance > 0) {
			balance = balance + _balance;
		}
	}
	
	public void doDebit(int _balance) {
		if(_balance >= balance) {
			balance = balance - _balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
