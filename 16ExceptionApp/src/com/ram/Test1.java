package com.ram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println(" Program Execution started  ");
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Please enter the a value :");
		try {
			int a = scanner.nextInt();
			System.out.println(" Please enter the b value :");
			int b = scanner.nextInt();

			int c = a / b;
			System.out.println(" The result is: " + c);
		} catch (ArithmeticException e) {
			System.out.println(" Please dont enter b as 0 ");
		} catch (InputMismatchException e) {
			System.out.println(" Please enter number ic values ");
		} finally {
			scanner.close();// release the resource
			System.out.println("Resource Released");
		}
		System.out.println(" Program Execution Completed  ");
	}
}
