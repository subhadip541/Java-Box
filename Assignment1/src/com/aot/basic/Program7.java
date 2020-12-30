package com.aot.basic;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		System.out.print("Enter the number of terms : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Fibonnaci series is : ");
		for (int i = 0; i < n; i++)
		{
			int x=fibo(i);
			
	       System.out.print(x+" ");
	    }

	}
	 static int fibo(int n) {
		 if(n==0) {
			 return 0;
		 }
		 else if(n==1 || n==2) {
			 return 1;
		 }
		 else {
			 return fibo(n-1)+fibo(n-2);
		 }
		
	}
}
