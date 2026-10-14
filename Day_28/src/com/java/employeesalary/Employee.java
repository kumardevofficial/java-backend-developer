package com.java.employeesalary;

public class Employee {

	private String employeeId;
	private String name;
	private double salary;
	
	Employee(String employeeId, String name, double salary){
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	
	public void setSalary(double _salary) {
		if(_salary > 0) {
			this.salary = _salary;
		}
	}
	
	public void showEmployeeDetials() {
		System.out.println("The employee Id is :" + this.employeeId + " \n The employee name is :"+ this.name + "\n The employee salary is :" + this.salary);
	}
}


//3. Employee Salary
//Create an Employee class with employeeId, name, and salary.
//- Keep all fields private.
//- Allow salary updates only when the new salary is positive.
//- Display employee details using a method.
//Practise: validation through setters.