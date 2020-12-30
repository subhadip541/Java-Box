package com.aot.string;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		char ch[] = new char[str.length()];
		str.getChars(0, str.length(), ch, 0);
		System.out.println(ch);
	}

}
