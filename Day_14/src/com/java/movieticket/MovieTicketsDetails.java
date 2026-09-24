package com.java.movieticket;

public class MovieTicketsDetails {

	String movieName;
	String theaterName;
	int seatNumber;
	double ticketPrice;
	
	MovieTicketsDetails(String _movieName, String _theaterName, int _seatNumber, double _ticketPrice)
	{
		this.movieName = _movieName;
		this.theaterName = _theaterName;
		this.seatNumber = _seatNumber;
		this.ticketPrice = _ticketPrice;
	}
	
}


