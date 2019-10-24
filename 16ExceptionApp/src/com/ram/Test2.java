package com.ram;

import java.util.InputMismatchException;

public class Test2 {
	public static void main(String[] args) {
		int a = 12;
		int b = 0;
		try {
			int c = a / b;
			System.out.println("The Result is " + c);
		} catch (ArithmeticException | InputMismatchException e) {
			
		} finally {
			System.out.println(" Resource released");
		}
	}
}
