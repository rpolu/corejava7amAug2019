package com.ram;

public class EmployeeDaoImpl implements EmployeeDao {

	public void saveEmp(int empId, String name, String salary) {
		System.out.println("Employee data saved ");
	}

	public void displayData(int empId, String name, String salary) {
        System.out.println(empId);
        System.out.println(name);
        System.out.println(salary);
	}

}
