package com.prathima1;
class Student{
	
	String name="Shiva";
	void m1(String name) {
		System.out.println(name+" is good");
	}
	
	void m1(int a) {
		System.out.println(name+" is bad");
	}
}
public class Poly2 {
	public static void main(String[] args) {
		Student a=new Student();
		a.m1(9);

	}

}
