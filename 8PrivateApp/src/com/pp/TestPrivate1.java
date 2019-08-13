package com.pp;

class Student {
	private int rollNum;
	private String name;

	private void m1() {
		rollNum = 89;
		System.out.println(rollNum);
		System.out.println(name);
	}

}

public class TestPrivate1 {

	public static void main(String[] args) {
		Student student = new Student();
	}

}
