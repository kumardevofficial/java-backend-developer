package com.java.mobilephone;

public class Driver {

	public static void main(String args[]) {
		MobilePhone mobile = new MobilePhone("OPPO", "OPPOA6", 0 , 6000);
		System.out.println("The mobile phoen current battery percentage is :" + mobile.getBatteryPercentage()+ "%");
		mobile.setBatteryPercentage(50);
		System.out.println("The mobile phoen current battery percentage is :" + mobile.getBatteryPercentage()+ "%");		
	}
}
