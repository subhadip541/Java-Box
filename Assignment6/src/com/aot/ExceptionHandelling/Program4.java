package com.aot.ExceptionHandelling;

import java.io.*;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		try {
			Ass6Q41 ob = null;
			System.out.println(ob.sum(5, 6));
		} catch (Exception e) {
			System.out.println("Exception caught : "+e);
		}
	}
}

class Ass6Q41 {
	public int sum(int a, int b) {
		return a + b;
	}
}
