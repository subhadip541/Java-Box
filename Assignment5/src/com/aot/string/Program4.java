package com.aot.string;

import java.io.IOException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		int counter = 0;
		System.out.println("Enter the subsequence string to search : ");
		String search = sc.nextLine();
		if (str.contains(search)) {
			System.out.println("Subsequence found");
		} else {
			System.out.println("Subsequence not found");
		}

	}

}
