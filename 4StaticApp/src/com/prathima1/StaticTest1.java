package com.prathima1;

class A {
	static int a = 12;
	static String name = "mohan";
    int x=90;// instance 
	static void m1() {
		System.out.println("from m1() static method");
	}

	static void m2() {
		System.out.println(a);
		System.out.println(name);
	}

	void m3() {
		System.out.println(a);
		System.out.println(name);
		System.out.println(x);
	}
}

public class StaticTest1 {

	public static void main(String[] args) {
		A a = new A();

	}
}
