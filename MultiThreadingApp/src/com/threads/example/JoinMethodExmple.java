package com.threads.example;
class Processor extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(getName() + " :" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinMethodExmple {
	public static void main(String[] args) {
		Processor p = new Processor();
		p.setName("Processor");
		p.start();
		try {
			p.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 31; i <= 60; i++) {
			System.out.println(Thread.currentThread().getName() + " :" + i);
		}
	}
}
