package com.aot.basic;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		System.out.print("Enter the number of row/column : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (true) {
			System.out.print("1.Addition" + "	");
			System.out.print("2.Substraction" + " ");
			System.out.print("3.Multipication" + " ");
			System.out.println("4.Exit" + " ");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addition(n, sc);
				break;
			case 2:
				Subtraction(n, sc);
				break;
			case 3:
				Multiplication(n, sc);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Input");
				break;

			}
		}
	}

	static void addition(int n, Scanner sc) {
		int arr[][] = new int[n][n];
		int brr[][] = new int[n][n];
		int crr[][] = new int[n][n];
		System.out.print("Enter the elements of the 1st matrix : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the elements of the 2nd matrix : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}
		System.out.println("Addition of the matrix is : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(crr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void Subtraction(int n, Scanner sc) {
		int arr[][] = new int[n][n];
		int brr[][] = new int[n][n];
		int crr[][] = new int[n][n];
		System.out.print("Enter the elements of the 1st matrix : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the elements of the 2nd matrix : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				crr[i][j] = arr[i][j] - brr[i][j];
			}
		}
		System.out.println("Subtraction of the matrix is : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(crr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void Multiplication(int n, Scanner sc) {
		int arr[][] = new int[n][n];
		int brr[][] = new int[n][n];
		int crr[][] = new int[n][n];
		int i = 0;
		int j = 0;
		int k = 0;
		System.out.print("Enter the elements of the 1st matrix : ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the elements of the 2nd matrix : ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				crr[i][j] = 0;
				for (k = 0; k < 2; k++) {
					crr[i][j] += arr[i][k] * brr[k][j];
				}
			}
		}
		System.out.println("Multiplication of the matrix is : ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(crr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
