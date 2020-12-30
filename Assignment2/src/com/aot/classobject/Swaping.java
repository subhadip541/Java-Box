package com.aot.classobject;

import java.util.Scanner;

public class Swaping {
	private int a=10,b=20;
	Swaping(int a,int b){
		this.a=a;
		this.b=b;
	}
	static void swapbyref(Swaping obj) {
		int t=obj.a;
		obj.a=obj.b;
		obj.b=t;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integers for swaping : ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		Swaping obj=new Swaping(m,n);
		System.out.println("Before swap --->> x = "+m+" and y = "+n);
		swapbyref(obj);
		System.out.println("After swap --->> x = "+obj.a+" and y = "+obj.b);
	}
	
	
}
