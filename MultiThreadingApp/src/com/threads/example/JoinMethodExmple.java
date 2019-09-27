package com.threads.example;

class Processor extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(getName() + " :" + i);
		}
	}
}

class Executor extends Processor {
	public void run() {
		for (int i = 31; i <= 60; i++) {
			System.out.println(getName() + " :" + i);
		}
	}
}

public class JoinMethodExmple {

	public static void main(String[] args) {

		Processor p = new Processor();
		p.setName("Processor");

		Executor e = new Executor();
		e.setName("Executor");
		p.start();
		try {
			p.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		e.start();
	}

}
