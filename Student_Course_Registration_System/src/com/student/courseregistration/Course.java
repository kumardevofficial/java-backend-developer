package com.student.courseregistration;

import java.util.Scanner;

public class Course {

	String courseId;
	String courseName;
	double courseFee;
	
	Course(String courseId, String courseName, double courseFee){
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	void coursseDetails(){
		System.out.println("The course Id :" + courseId);
		System.out.println("The course Name is :" + courseName);
		System.out.println("The course Fee :" + courseFee);
	}

}


