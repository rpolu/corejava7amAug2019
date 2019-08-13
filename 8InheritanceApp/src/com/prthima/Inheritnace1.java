package com.prthima;

class A {
	int x = 23;
	int y = 89;
	A(int a) {
		System.out.println(" from A() ");
	}
	void m1() {
		System.out.println("from m1()");
	}
}

class B extends A {
	int x = 44;
	B() {
		super(9);
	}

	void m2() {
		System.out.println(this.x);
		System.out.println(super.x);
	}

}

public class Inheritnace1 {
	public static void main(String[] args) {
		B a = new B();
		a.m1();
		a.m2();
	}

}
