package com.aot.oops;

public class Program6 extends Abstract {
	public static void main(String[] args) {
		Abstract a1 = new Program6();
		a1.add(20, 30);
	}
}

abstract class Abstract {
	void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum = " + c);
	}
}