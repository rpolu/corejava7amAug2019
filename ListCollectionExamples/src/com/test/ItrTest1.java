package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ItrTest1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(23);
		al.add("Rama");
		al.add(78);
		al.add("JJJ");

		// Iterator
		ListIterator it = al.listIterator();

		while (it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
		}

		while (it.hasPrevious()) {
			Object ob = it.previous();
			System.out.println(ob);
			if (ob.equals("JJJ")) {
				it.remove();
			}

		}
		System.out.println(al);
	}

}
