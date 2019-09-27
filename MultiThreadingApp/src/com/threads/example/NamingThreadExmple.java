package com.threads.example;

class MyThread extends Thread {
	public void run() {
		System.out.println("Thred Name: " + getName());
		System.out.println("Thread is running ");
	}
}

public class NamingThreadExmple {
	public static void main(String[] args) {
		System.out.println("Thred Name : " + Thread.currentThread().getName());
		
		MyThread mt1 = new MyThread();
		mt1.setName("myThredOne");
		mt1.start();

		MyThread mt2 = new MyThread();
		mt2.setName("myThredTwo");
		mt2.start();
	}
}
