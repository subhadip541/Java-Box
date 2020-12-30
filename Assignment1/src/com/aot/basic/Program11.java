package com.aot.basic;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, i, j, flag;
		System.out.print("Enter lower bound : ");
		a = sc.nextInt(); // Take input
		System.out.print("\nEnter upper bound : ");
		b = sc.nextInt(); // Take input
		System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

		for (i = a; i <= b; i++) {

			if (i == 1 || i == 0)
				continue;

			flag = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.print(i+" ");
		}
	}
}
