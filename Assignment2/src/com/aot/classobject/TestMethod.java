package com.aot.classobject;

public class TestMethod {
	int x;

	TestMethod(int x) {
		this.x = x;
	}

	TestMethod returnobj(TestMethod obj) {
		TestMethod t1 = new TestMethod(obj.x + 10);
		return t1;
	}

	public static void main(String[] args) {
		TestMethod t1 = new TestMethod(10);
		System.out.println("t1.a --> " + t1.x);
		TestMethod t2 = t1.returnobj(t1);
		System.out.println("t2.a --> " + t2.x);
		TestMethod t3 = t2.returnobj(t2);
		System.out.println("t3.a --> " + t3.x);
	}
}
