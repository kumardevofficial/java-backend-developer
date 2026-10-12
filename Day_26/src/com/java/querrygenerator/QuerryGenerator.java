package com.java.querrygenerator;

public class QuerryGenerator {

	public StringBuilder generateQuerry(int salary, String empId) {
		StringBuilder query = new StringBuilder("Select * from employee "); // created sb object

		if (salary > 0) {
			query.append("where salary = " + salary + ";");
		} else if (empId != null) {
			query.append("where empId = " + empId + ";");
		} else {
			query.append(";");
		}

		return query;
	}
}
