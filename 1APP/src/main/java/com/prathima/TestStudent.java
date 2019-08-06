
package com.prathima;

class Student{
	int rollNum;
	String name;
	int marks;
	void hh() {
		rollNum=12;
		name="mohan";
		marks=90;
	}
	
	void m1() {
		System.out.println(rollNum);
		System.out.println(name);
		System.out.println(marks);
	}
}



public class TestStudent {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.m1();
		s.hh();
		s.m1();
		s.m1();
	}

}
