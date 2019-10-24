package com.ram;

interface A {
	void m1();
}
interface B {
	void m2();
}
class C implements A,B {
	public void m2() {
		System.out.println("from m2()");
	}
	public void m1() {
		System.out.println("from m1()");
	}
}
public class Test2 {
	public static void main(String[] args) {
           A a=new C();
           B b=new C();
           a.m1();
           b.m2();
	}

}
