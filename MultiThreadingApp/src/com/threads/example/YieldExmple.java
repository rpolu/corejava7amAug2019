package com.threads.example;

class Running extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + "-" + i);
			if (getName().equals("My Thread 1")) {
				yield();
				System.out.println("Given chance to another thread");
			}
		}
	}

}

public class YieldExmple {

	public static void main(String[] args) {
		Running r1 = new Running();
		r1.setName("My Thread 1");
		Running r2 = new Running();
		r2.setName("My Thread 2");
		r1.start();
		r2.start();
	}

}
