package com.threads.example;

class Runner extends Thread {

	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(getName() + " :" + i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SleepExmple {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.setName("Runner Thread");
		runner.start();
	}

}
