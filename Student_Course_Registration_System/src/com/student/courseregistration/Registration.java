package com.student.courseregistration;

public class Registration {

	Student student;
	Course course;
	
	Registration(Student student, Course course){
		this.student = student;
		this.course = course;
	}
	
	Registration(){}
	
	void ageChecker() {
		if(student.getAge() > 18) {
			System.out.println(" Student is greater then 18");
		} else {
			System.out.println(" Student is age is less then 18");
		}
	}
	
	void isAffordable(double amount) {
		
		if (amount < course.courseFee) {
		 System.out.println(" Not affordable ");
		} else {
			System.out.println(" Affordable ");
		}
	}
	
	Registration createRegister(Student student, Course course) {
		Registration register = new Registration (student, course);
		return register;
	}
}


//Store a student reference and a course reference

//Store the registration status

//Check whether the student's age is at least 18

//Check whether the course fee is affordable

//Display whether registration succeeded or failed