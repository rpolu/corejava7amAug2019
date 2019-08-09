package com.prathima;

class Student {
	Student(int a) {
		System.out.println(" from prama int constructor");
	}

	Student(String n) {
		System.out.println(" non pram constructor");
	}

}

public class ConsTest1 {

	public static void main(String[] args) {
		Student s = new Student(7);

	}

}
