package com.prthima;

class Car {
	Car() {
		System.out.println(" from car ");
	}
}

class KiaCar extends Car {
	KiaCar() {
		this(8);
		System.out.println(" from Kiacar");

	}

	KiaCar(int a) {
		super();
		System.out.println(" from Kiacar (int)");
	}

}

public class Inheritnace2 {

	public static void main(String[] args) {
		Car c = new KiaCar();

	}

}
