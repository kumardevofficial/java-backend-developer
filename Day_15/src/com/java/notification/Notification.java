package com.java.notification;

public class Notification {

	public void sendNotiffication(String _type) {
		System.out.println("notificationService.sendNotification()");

		if (_type.equalsIgnoreCase("sms")) {
			sendSMS();
		} else if (_type.equalsIgnoreCase("email")) {
			sendEmail();
		} else {
			sendWhatsapp();
		}
	}

	private void sendSMS() {

		System.out.println("Notification.sendSMS() START");

		System.out.println("Notification.sendSMS() END");
	}

	private void sendEmail() {
		System.out.println("Notification.sendEmail() START ");
		System.out.println("Notification.sendEmail() END");
	}

	private void sendWhatsapp() {
		System.out.println("Notification.sendWhatsapp() START ");
		System.out.println("Notification.sendWhatsapp() END");
	}
}
