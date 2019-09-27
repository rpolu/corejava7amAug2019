package com.threads.example;

class Thread1 implements Runnable {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
		}
	}

}

class Thread2 implements Runnable {
	public void run() {
		for (int i = 31; i <= 60; i++) {
			System.out.println(i);
		}
	}

}

public class RunnableMutiThreds {

	public static void main(String[] args) {
		Thread1 mt1 = new Thread1();
		Thread2 mt2 = new Thread2();
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
	}

}
