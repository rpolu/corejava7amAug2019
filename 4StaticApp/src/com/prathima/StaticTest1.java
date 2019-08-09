package com.prathima;

class A {
	static int a = 12;
	static String name = "mohan";

	static void m1() {
		System.out.println("from m1() static method");
	}

	static void m2() {
		System.out.println(a);
		System.out.println(name);
	}
	
	void m3() {
		
	}
}

public class StaticTest1 {

	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(A.name);
		
		A.m1();
		A.m2();

	}
}
