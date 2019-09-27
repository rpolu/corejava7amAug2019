package com.test;

import java.util.TreeSet;

class Emp implements Comparable {
	private Integer empId;

	private String name;

	public Emp(Integer empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + "]";
	}

	public int compareTo(Object o) {
		Emp e = (Emp) o;
		return empId.compareTo(e.empId);
	}

}

public class TestSortedSet2 {

	public static void main(String[] args) {
		Emp e1 = new Emp(12, "mohan");
		Emp e2 = new Emp(13, "JJ");
		Emp e3 = new Emp(1, "mohsn");
		TreeSet ts = new TreeSet<>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		System.out.println(ts);

	}

}
