package com.m1;
class Employee{
	int empId;
	String name;
    double salary;
    Employee(int eid,String nm,double sal){
    	empId=eid;
    	name=nm;
    	salary=sal;
    }
    
    void printEmpData() {
    	System.out.println(empId);
    	System.out.println(name);
    	System.out.println(salary);
    }
}
public class TestMethod2 {

	public static void main(String[] args) {
		Employee employee=new Employee(45, "hhh", 899.90);
		employee.printEmpData();

	}

}
