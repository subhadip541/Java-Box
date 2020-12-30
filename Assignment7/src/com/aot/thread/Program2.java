package com.aot.thread;

public class Program2 {
	public static void main(String args[]) {
		X x = new X();
		Thread t1=new Thread(x,"Dip");
		t1.start();
	}
}
class X implements Runnable{
	public void run() {
		int i = 1;
		while (i++ < 4) {
			System.out.println(Thread.currentThread().getName()+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
}
