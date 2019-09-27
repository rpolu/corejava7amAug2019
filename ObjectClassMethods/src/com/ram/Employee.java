package com.ram;

public class Employee {
	int empId;
	String name;

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	public int hashCode() {
		return this.empId;
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (e.empId == this.empId && name.equals(e.name)) {
			return true;
		} else {
			return false;
		}

	}

}
