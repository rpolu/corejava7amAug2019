package com.threads.example;

class MyRunnableTh implements Runnable {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
		}
	}

}

public class RunnableThred {
	public static void main(String[] args) {

		MyRunnableTh mt = new MyRunnableTh();
		Thread thread = new Thread(mt);
		thread.start();

	}

}
