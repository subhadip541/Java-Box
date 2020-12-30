package com.aot.basic;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		double root1, root2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a :");
		double a = sc.nextDouble();

		System.out.print("Enter the value of b :");
		double b = sc.nextDouble();

		System.out.print("Enter the value of c :");
		double c = sc.nextDouble();
		double d = (b * b) - 4 * a * c;
		if (d > 0) {
			root1 = (-b + Math.sqrt(d)) / 2 * a;
			root2 = (-b - Math.sqrt(d)) / 2 * a;
			System.out.println("Both the roots are same ");
			System.out.println("Root 1 : " + root1 + " " + "Root 2 : " + root2);
		} else if (d == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.println("Roots are same : " + root1);
		} else {
			root1 = -b / (2 * a);
			root2 = Math.sqrt(-d) / (2 * a);
			System.out.println("Root 1 : " + root1 + " " + "Root 2 : " + root2+"i");
		}

	}

}
