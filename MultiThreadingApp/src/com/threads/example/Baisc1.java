package com.threads.example;

class FirstThread extends Thread {
	public void run() {
		System.out.println("running");
	}
}

public class Baisc1 {
	public static void main(String[] args) {
		System.out.println(" 1 Name of the Thread : " + Thread.currentThread().getName());
		FirstThread t1 = new FirstThread();
		FirstThread t2 = new FirstThread();
		FirstThread t3 = new FirstThread();
		t1.setName("First Thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());

	}

}
