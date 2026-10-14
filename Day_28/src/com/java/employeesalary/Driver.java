package com.java.employeesalary;

public class Driver {

	public static void main(String[] args) {
		Employee emp = new Employee("DEV667", "dev kumar", 145000);
		
		emp.showEmployeeDetials();
		emp.setSalary(200000);
		emp.showEmployeeDetials();
	}

}
