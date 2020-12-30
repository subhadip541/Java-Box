package com.aot.basic;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of 1st number :");
		int a = sc.nextInt();

		System.out.print("Enter the value of 2nd number :");
		int b = sc.nextInt();
		int result=gcd(a,b);
		System.out.println("GCD will be : "+result);
		
	}
	static int gcd(int a,int b) {
		if(a>b) {
			return gcd(a-b,b);
		}
		else if(a<b) {
			return gcd(a,b-a);
		}
		else {
			return a;
		}
	}

}
