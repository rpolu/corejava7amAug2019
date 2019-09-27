package com.ram;

class Student {
	private int rollNum;
	private String name;

	public Student(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}

	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + "]";
	}

	public int hashCode() {
		return rollNum;
	}
}

public class HashCodeTest {

	public static void main(String[] args) {
		Student student1 = new Student(11, "mohan");

		Student student2 = new Student(11, "mohan");
		System.out.println(student1);

		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

	}

}
