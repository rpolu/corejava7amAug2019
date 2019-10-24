package com.ram;

class A {
	void m1() {

	}
}

public class NullPonterTest6 {
	static A x;

	public static void main(String[] args) {
		try {
			x.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
