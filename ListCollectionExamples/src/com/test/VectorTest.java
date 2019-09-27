package com.test;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add(12);
		vector.add(67);
		vector.add(0, "rama");
		System.out.println(vector);

		Enumeration e = vector.elements();
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);

		}
	}

}
