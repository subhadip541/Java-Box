package com.aot.string;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		char ch[] = new char[5 + str.length()];
		ch[0] = 'h';
		ch[1] = 'e';
		ch[2] = 'l';
		ch[3] = 'l';
		ch[4] = 'o';
		str.getChars(0, str.length(), ch, 5);
		System.out.println(ch);
	}

}
