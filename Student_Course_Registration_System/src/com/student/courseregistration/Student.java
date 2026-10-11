package com.student.courseregistration;

import java.util.Scanner;

public class Student {

	private String studentId;
	String studentName;
	private int age;
	
	Student(String studentId, String studentName, int age){
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
	}
	
	void studentDetails(){
		System.out.println("The studenId :"+ studentId);
		System.out.println("The student name :"+ studentName);
		System.out.println(" The student age :"+ age);
	}
	
	int getAge() {
		return this.age;
	}
	
}
