package com.prathima;
class A{
	int x;
	int y;
	A(){
		x=90;
		y=89;
	}
	void m1() {
		System.out.println(x);
		System.out.println(y);
	}
	
}
public class TestCons {

	public static void main(String[] args) {
		
		A a=new A();
		a.m1();

	}

}
