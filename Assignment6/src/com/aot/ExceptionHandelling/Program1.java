package com.aot.ExceptionHandelling;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;

		try {
			int c = a / b;
			System.out.println("Result : " + c);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught : " + e);

		}
	}

}
