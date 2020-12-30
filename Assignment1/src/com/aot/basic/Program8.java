package com.aot.basic;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		System.out.print("Enter the number of terms : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Enter the value of X : ");
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		int i=0;
		int sum=0;
		while(i<n) {
			sum+=Math.pow(x, i);
			i++;
		}
		System.out.println("Sum of the series : "+sum);
	}
}
