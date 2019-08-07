package com.m1;
class A{
	int x;
	int y;
	void intialise(int l,int m) {
		x=l;
		y=m;
	}
	void printData() {
		System.out.println(x);
		System.out.println(y);
	}
}
public class TestMethod1 {

	public static void main(String[] args) {
		A a=new A();
		a.intialise(34,90);
		a.printData();
	}

}
