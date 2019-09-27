package com.test;

import java.util.LinkedList;

class Emp {
	public String toString() {
		return "emp";
	}
}

public class ArrayListExample {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(10);
		al.add("rama");
		al.add(10);
		al.add(67.89f);
		al.add(new Emp());
		System.out.println(al);
		al.add(1, "kalyan");

		System.out.println(al.size());
		System.out.println(al);
	}

}
