package com.ram;

public class LargeINtwoNms {

	public static int getLargeValue2(int a, int b) {
		int max = 0;
		if (a == b) {
			System.out.println(" both are equal ");
			max = a;// b also fine here
		} else if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;

	}

	public static int getLargeValue3(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c && b > a) {
			return b;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {
		int max = LargeINtwoNms.getLargeValue2(12, 90);
		System.out.println(max);
		
		int max1 = LargeINtwoNms.getLargeValue3(12,888, 90);
		System.out.println(max1);
	}

}
