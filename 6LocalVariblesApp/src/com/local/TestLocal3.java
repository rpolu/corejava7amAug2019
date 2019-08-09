package com.local;
class Xyz{
	int a=78;
	void m1() {
		int a=90;// local variable
		System.out.println(this.a);
	}
	
}
public class TestLocal3 {

	public static void main(String[] args) {
		Xyz x=new Xyz();
        x.m1();
	}

}

