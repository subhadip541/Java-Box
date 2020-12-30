package com.aot.oops;

public class Program4 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.show();
		Test2 t2 = new Test2();
		t2.show();
		Test3 t3 = new Test3();
		t3.show();
	}
}

class Test1 {
	void show() {
		System.out.println("This is class 1");
	}
}

class Test2 extends Test1 {
	void show() {
		System.out.println("This is class 2");
	}
}

class Test3 extends Test2 {
	void show() {
		System.out.println("This is class 3");
	}
}
