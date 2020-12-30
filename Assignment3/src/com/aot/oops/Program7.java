package com.aot.oops;

public class Program7 {
	public static void main(String[] args) {
		Math m1 = new Math();
		m1.sum(10, 20);
	}
}

abstract class Study {
	abstract void sum(int a, int b);
}

class Math extends Study {
	void sum(int a, int b) {
		int c = a + b;
		System.out.println("Sum = " + c);
	}
}