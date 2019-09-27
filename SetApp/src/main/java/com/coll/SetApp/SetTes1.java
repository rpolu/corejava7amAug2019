package com.coll.SetApp;

import java.util.HashSet;

class Emp {
	int empId;
	String name;

	public Emp(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public String toString() {
		return empId + "-" + name;
	}

	public int hashCode() {
		return empId;
	}

	public boolean equals(Object obj) {
		Emp e=(Emp)obj;
		return this.name.equals(e.name);
	}

}

public class SetTes1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Emp e1 = new Emp(12, "mohan");
		Emp e2 = new Emp(12, "mohan");

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		hs.add(e1);
		hs.add(e2);

		System.out.println(hs);

	}

}
