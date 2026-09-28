package com.java.university;

public class University {

	String universityName;
	String location;
	
	University(String universityName, String location){
		this.universityName = universityName;
		this.location = location;
	}
	
	University(){
		this("Default University", "Default location");
	}
	
	University (String universityName){
		this(universityName, "Default location");
	}
	
	void showUniversityDetails() {
		System.out.println(this.universityName);
		System.out.println(this.location);
	}
}
