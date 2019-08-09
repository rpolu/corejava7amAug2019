package com.prathima1;
class Student1{
	
	void m1(int a,String name) {
		System.out.println(name+" is good");
	}
	
	void m1(String name,int b) {
		System.out.println(name+" is bad");
	}
}
public class Poly3 {

	public static void main(String[] args) {
		Student1 a=new Student1();
		a.m1(9,"ll");


	}

}
