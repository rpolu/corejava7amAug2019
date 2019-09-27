package com.coll.SetApp;

import java.util.HashSet;

public class SetTes2 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("ramu");
		hs.add("KKKK");
		hs.add("mohan");
		hs.add("shiva");
		hs.add("amar");
		hs.add("kalyan");
		hs.add("prasad");
		

		for (String j : hs) {
			System.out.println(j);
		}

	}

}
