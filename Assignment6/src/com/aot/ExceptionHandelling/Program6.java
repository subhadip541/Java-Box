package com.aot.ExceptionHandelling;

import java.io.*;

public class Program6 {
	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("Caught: " + e);
		}
	}
}