package com.student.courseregistration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		InputHandler inputHandler = new InputHandler(sc);
		
		Student student = inputHandler.createStudent();
		Course course = inputHandler.createCourse();
		Registration register = new Registration(student, course);
		register.student.studentDetails();
		register.course.coursseDetails();
		
	}


}

