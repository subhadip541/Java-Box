package com.aot.classobject;

import java.util.Scanner;

public class Program8a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		Student[] stuarr = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name of the student : ");
			String name = sc.next();
			System.out.println("Enter the roll of the student : ");
			int roll = sc.nextInt();
			System.out.println("Enter the College name of the student : ");
			String collegename = sc.next();
			System.out.println("Enter the Stream of the student : ");
			String Streamname = sc.next();
			stuarr[i] = new Student(name, roll, collegename, Streamname);
		}
		for (int i = 0; i < n; i++) {
			stuarr[i].show();
			System.out.println();
		}

	}
}
