package com.ram;

public class Test5 {
	public static void main(String[] args) {
		int a = 12;
		int b = 0;
        try {
		int c = a / b;
        }catch (ArithmeticException e) {
			System.out.println(e.toString());
			
			System.out.println("********************");
			
			
			System.out.println(e.getMessage());
			
			
			System.out.println("***********************");
			
			System.out.println(e.getCause());
		}
		
		

	}
}
