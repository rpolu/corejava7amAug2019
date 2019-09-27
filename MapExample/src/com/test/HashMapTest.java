package com.test;

import java.util.Hashtable;

public class HashMapTest {

	public static void main(String[] args) {

		Hashtable map = new Hashtable();
		map.put("sachin", 34);
		map.put("dravid", 45);
		map.put("ll", null);
		map.put("bb", 89);
		map.put("sachin", 67);
		map.put("ccc", 56);
		map.put("hh", 45);

		System.out.println(map);

	}

}
