package com.java.student;

public class Driver {

	public static void main(String[] args) {
		Student st = new Student("Dev123", "Dev Kumar", 24);
		System.out.println(st.getAge());
		st.setAge(66);
		System.out.println(st.getAge());
	}

}
