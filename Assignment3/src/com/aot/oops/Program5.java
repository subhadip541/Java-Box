package com.aot.oops;

public class Program5 {
	public static void main(String[] args) {
		one obj;
		obj = new one();
		obj.show();
		obj = new two();
		obj.show();
		obj = new three();
		obj.show();
	}
}

class one {
	void show() {
		System.out.println("This is class 1");
	}
}

class two extends one {
	void show() {
		System.out.println("This is class 2");
	}
}

class three extends two {
	void show() {
		System.out.println("This is class 3");
	}
}
