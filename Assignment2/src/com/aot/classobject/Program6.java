package com.aot.classobject;

public class Program6 {

	public static void main(String[] args) {
		Test t1 = new Test(20);
		t1.show();
	}

}

class Test {
	int x;

	Test(int x) {
		this.x = x;
	}

	void show() {
		System.out.println("Value is : " + this.x);
	}

	public static void main(String[] args) {
		Test t1 = new Test(20);
		t1.show();
	}
}