package com.ram.AbsApp;

abstract   class Car {
	Car() {
		System.out.println("from Constructor");
	}

	void m1() {
		System.out.println(" from m1()");
	}

	void m2() {
		System.out.println(" from m2()");
	}
}

class KiaCar extends Car {

}

public class TestAbs1 {

	public static void main(String[] args) {
		Car c = new KiaCar();
		c.m1();
		c.m2();

	}

}
