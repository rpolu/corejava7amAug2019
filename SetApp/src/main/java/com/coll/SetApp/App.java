package com.coll.SetApp;

public class App<E> {

	public void m1(E e) {
		System.out.println(e);
	}

	public static void main(String[] args) {
		
		App a = new App();
		a.m1("GGG");
		a.m1(20);
		a.m1(a);
		
		
	}
}
