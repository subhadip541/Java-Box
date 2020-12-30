package com.aot.thread;

public class Program3 {
	public static void main(String args[]) {
		Thread1 ob1 = new Thread1("One");
		Thread1 ob2 = new Thread1("Two");
		Thread1 ob3 = new Thread1("Three");
		Thread1 ob4 = new Thread1("Four");
		Thread1 ob5 = new Thread1("Five");
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
class Thread1 extends Thread{
	Thread1(String name){
		super(name);
	}
	public void run() {
		int i=0;
		while(i++<4) {
			System.out.println("Thread name : " +Thread.currentThread().getName()+"	 "+ "Thread number : " + i);
		}
	}
}
