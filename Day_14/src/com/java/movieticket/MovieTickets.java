package com.java.movieticket;

public class MovieTickets {

	public static void main(String args[])
	{
//		 first ticket object 
		MovieTicketsDetails ticket1 = new MovieTicketsDetails("Hanuman ansh", "sankar takij", 55, 210);
		System.out.println(
				"The Movie Name is :" + ticket1.movieName +
				"\n The Theater Name is :"+ ticket1.theaterName +
				"\n The seat Number is :" + ticket1.seatNumber +
				"\n The ticket price is :"+ ticket1.ticketPrice
		);
		
//		second ticket object
		MovieTicketsDetails ticket2 = new MovieTicketsDetails("end game", "galaxy mall", 43, 500);
		System.out.println(
				"The Movie Name is :" + ticket2.movieName +
				"\n The Theater Name is :"+ ticket2.theaterName +
				"\n The seat Number is :" + ticket2.seatNumber +
				"\n The ticket price is :"+ ticket2.ticketPrice
		);
		
//		Third ticket object 
		MovieTicketsDetails ticket3 = new MovieTicketsDetails("kick","manisha mall", 44, 600);
		System.out.println(
				"The Movie Name is :" + ticket3.movieName +
				"\n The Theater Name is :"+ ticket3.theaterName +
				"\n The seat Number is :" + ticket3.seatNumber +
				"\n The ticket price is :"+ ticket3.ticketPrice
		);
	}
}


