package com.ram.abs;
abstract class Fan {
	abstract void m1();
	abstract void m2();
	void revolve() {
		System.out.println(" Fan is working ");
	}
}
class GangaFan extends Fan {
	void m1() {
		System.out.println("from m1()");
	}
	void m2() {
		System.out.println("from m2()");
	}
}

public class Test2 {
	public static void main(String[] args) {
		 Fan f=new GangaFan();
		 f.m1();
		 f.m2();
	}

}
