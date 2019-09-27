package com.ram;

class A {
	public String toString() {
		return "Object of A calss";
	}
}

public class ToString {

	public static void main(String[] args) {
		int x = 12;
		System.out.println(x);

		A a = new A();
		System.out.println(a);
		System.out.println(a.toString());

		Employee e = new Employee(12,"rama");
		System.out.println(e);

	}

}
