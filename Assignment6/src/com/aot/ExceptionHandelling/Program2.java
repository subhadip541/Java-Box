package com.aot.ExceptionHandelling;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = new int[20];
			arr[21] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught : " + e);
		}
		try {
			String str = "Hello";
			char c = str.charAt(40);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception caught : " + e);
		}

	}

}
