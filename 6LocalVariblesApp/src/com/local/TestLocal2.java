package com.local;
class Employee{
	int empNum;
	String name;
	float salary;
	void giveData(int empNum,String name,float salary){
		this.empNum=empNum;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println(empNum);
		System.out.println(name);
		System.out.println(salary);
	}
	
	
}
public class TestLocal2 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.giveData(90, "HH", 9000.78f);
		employee.display();
		
	}

}

