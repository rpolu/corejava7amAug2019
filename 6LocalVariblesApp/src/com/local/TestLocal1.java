package com.local;
class A{
	void m1() {
		int a=90;// local variable
		String name;
		name="mohan";
		System.out.println(name);
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
	
}
public class TestLocal1 {

	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
		a.m2(9);

	}

}

