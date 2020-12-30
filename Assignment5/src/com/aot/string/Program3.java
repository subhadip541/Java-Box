package com.aot.string;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("length of a string : " + str.length());
		System.out.println("length of that string except front and end spaces : " + str.trim().length());
	}

}
