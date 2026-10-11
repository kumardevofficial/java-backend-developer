package com.student.courseregistration;

import java.util.Scanner;

public class InputHandler {
	
	Scanner sc;
	
	InputHandler(Scanner sc){
		this.sc = sc;
	}
	
	Student createStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sutdent Id :");
		String studentId = sc.nextLine();
		System.out.println(" Enter the student Name :");
		String studentName = sc.nextLine();
		System.out.println(" Etner the student age :");
		int age = sc.nextInt();
		sc.nextLine();	
		Student student = new Student(studentId, studentName, age);
		return student;
	}
	
	Course createCourse() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the course Id :");
		String courseId = sc.nextLine();
		System.out.println(" Etner the course Name :");
		String courseName = sc.nextLine();
		System.out.println(" Enter the course fee :");
		double courseFee = sc.nextDouble();
		sc.nextLine();
		Course course = new Course(courseId, courseName, courseFee);
		return course;
	}

}
