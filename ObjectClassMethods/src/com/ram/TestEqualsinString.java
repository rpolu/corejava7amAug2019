package com.ram;

public class TestEqualsinString {
	public static void main(String[] args) {
		String x = "rama";
		String y = new String("rama");
		System.out.println(x.equals(y));

		Thread t1 = Thread.currentThread();
		System.out.println(" Name of the thread : " + t1.getName());

	}

}
