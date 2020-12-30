package com.aot.thread;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y = new Y();
		Thread ob1 = new Thread(y,"One");
		Thread ob2 = new Thread(y,"Two");
		Thread ob3 = new Thread(y,"Three");
		Thread ob4 = new Thread(y,"Four");
		Thread ob5 = new Thread(y,"Five");
		ob1.setPriority(Thread.MIN_PRIORITY);
		ob2.setPriority(Thread.MAX_PRIORITY);
		ob3.setPriority(ob2.getPriority()-1);
		ob4.setPriority(ob2.getPriority()-2);
		ob5.setPriority(Thread.NORM_PRIORITY);
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
		ob5.start();
	}

}
class Y implements Runnable{
	public void run() {
		int i = 1;
		while (i++ < 4) {
			System.out.println("Thread name : " +Thread.currentThread().getName()+"	 "+ "Thread number : " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
}