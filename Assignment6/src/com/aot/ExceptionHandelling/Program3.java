package com.aot.ExceptionHandelling;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = new int[-10];
			arr[-1] = 10;
			System.out.println(arr[-1]);
		} catch (NegativeArraySizeException e) {
			System.out.println("Exception caught : " + e);
		}
	}

}
