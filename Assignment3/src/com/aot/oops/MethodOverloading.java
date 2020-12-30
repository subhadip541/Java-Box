package com.aot.oops;

public class MethodOverloading {
	public static void main(String[] args) {
		sum s1 = new sum();
		s1.add(50, 30);
	}

}

class sum {
	void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum = " + c);
	}

	void add() {
		System.out.println("Sum = " + 20);
	}
}