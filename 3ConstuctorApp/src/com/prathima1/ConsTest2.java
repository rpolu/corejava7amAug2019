package com.prathima1;
class Student {
	Student(int a) {
		System.out.println("from param int constructor");
	}

	Student(String n) {
		this(8);// constructor chaining 
		System.out.println("from param String constructor");
	}
	
	void m1() {
		System.out.println("from m1()");
	}

}
public class ConsTest2 {
	public static void main(String[] args) {
		Student student=new Student("rama");
		student.m1();
	}

}
