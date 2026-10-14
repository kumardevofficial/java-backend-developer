package com.java.student;

public class Student {

	private String studentId;
	private String name;
	private int age; 
	
	Student(String studentId, String name, int age){
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int _age) {
		if(_age > 0 && _age <= 120) {
			this.age = _age;
		}
	}
}


//1. Student Profile
//Create a Student class with studentId, name, and age.
//- Make all fields private.
//- Create a constructor and getters.
//- Allow age to be updated only if it is between 1 and 120.
//Practise: private fields, constructor, getters, validated setter.
