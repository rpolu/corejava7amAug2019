package com.ram;

public interface EmployeeDao {
	 abstract void  saveEmp(int empId,String name,String salary)throws Exception;
	 void displayData(int empId, String name, String salary);
}
