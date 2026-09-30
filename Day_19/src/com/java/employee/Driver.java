package com.java.employee;

public class Driver {

	public static void main(String[] args) {
		Employee emp1 = new Employee("alok", "al123", "555544452");
		Employee emp2 = new Employee("vikash", "vik345", "545469");
		Employee emp3 = new Employee("niraj", "vir435", "554667654");
		Employee emp4 = new Employee("vinay", "vin343", "764335344");
		Employee emp5 = new Employee("Akash", "aks234", "656776887");
		
		Employee emp[] = new Employee[5];
		
		emp[0] = emp1;
		emp[1] = emp2;
		emp[2] = emp3;
		emp[3] = emp4;
		emp[4] = emp5;
		
		System.out.println(emp[0].empName);

	}

}
