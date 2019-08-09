package com.prathima1;
class A{
	void m1() {
		System.out.println("from m1()");
	}
	
	void m1(int a) {
		System.out.println("from m1(int a)");
	}
}
public class Poly1 {

	public static void main(String[] args) {
		A a=new A();
		a.m1(9);

	}

}
