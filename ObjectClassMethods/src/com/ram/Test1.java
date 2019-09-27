package com.ram;

public class Test1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(12, "mohan");
		Employee e2 = new Employee(12, "mohan");
		if (e1.equals(e2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

	}

}
