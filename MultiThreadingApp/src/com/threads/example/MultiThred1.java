package com.threads.example;

class ThreadOne extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
		}
	}
}

class ThreadTwo extends Thread {
	public void run() {
		for (int i = 31; i <= 60; i++) {
			System.out.println(i);
		}
	}
}

public class MultiThred1 {
	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		t1.start();
		t2.start();

	}
}
