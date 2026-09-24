package com.java.notification;

public class Driver {

	public static void main(String[] args) {
		Notification notify = new Notification();
		notify.sendNotiffication("sms");
		notify.sendNotiffication("email");

	}

}
