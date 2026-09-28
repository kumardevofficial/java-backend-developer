package com.java.university;

public class Student extends University {

	String studentName;
	int rollNumber;
	String course;
	
	Student(String universityName, String location, String studentName, int rollNumber, String course){
		super(universityName, location);
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.course = course;
	}
	
	Student(){
		this("Default University", "Default location", "Defaul Student", 00, "unknown");
	}
	
}
