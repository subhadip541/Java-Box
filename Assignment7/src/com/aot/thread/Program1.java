package com.aot.thread;

public class Program1 {

	public static void main(String args[]) {
		MyThread ob3 = new MyThread("One");
		ob3.run();
	}
}

class MyThread extends Thread {
	MyThread(String name) {
		super(name);
	}

	public void run() {
		int i = 1;
		while (i++ < 4) {
			System.out.println(this.getName());
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
