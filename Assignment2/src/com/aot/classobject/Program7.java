package com.aot.classobject;

public class Program7 {
	public static Check getobj() {
		return new Check(23);
	}

	public static void main(String[] args) {
		Check t1 = new Check(30);
		System.out.println("Value is : " + t1.x);
	}

}

class Check {
	int x;

	Check(int x) {
		this.x = x;
	}

}