package com.aot.basic;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		System.out.print("Enter the principle : ");
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		System.out.print("Enter the interest : ");
		Scanner sc1=new Scanner(System.in);
		double r=sc1.nextDouble();
		System.out.print("Enter the time : ");
		Scanner sc2=new Scanner(System.in);
		double t=sc2.nextDouble();
		double i =(p*r*t)/100;
		System.out.println("Simple interest : "+i);

	}

}
