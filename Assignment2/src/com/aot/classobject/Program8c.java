package com.aot.classobject;

import java.util.Scanner;

public class Program8c {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student : ");
		String name = sc.next();
		System.out.println("Enter the roll of the student : ");
		int roll = sc.nextInt();
		System.out.println("Enter the College name of the student : ");
		String collegename = sc.next();
		System.out.println("Enter the Stream of the student : ");
		String Streamname = sc.next();
		System.out.println("Enter the Subject of the student : ");
		String subname = sc.next();
		System.out.println("Enter the internalmarks of the subject : ");
		int intmarks = sc.nextInt();
		System.out.println("Enter the theorymarks of the subject : ");
		int theorymarks = sc.nextInt();
		System.out.println();
		Subject sub = new Subject(subname, intmarks, theorymarks);
		StudentVar stu1 = new StudentVar(name, roll, collegename, Streamname, sub);

		System.out.println("Enter the name of the student : ");
		name = sc.next();
		System.out.println("Enter the roll of the student : ");
		roll = sc.nextInt();
		System.out.println("Enter the College name of the student : ");
		collegename = sc.next();
		System.out.println("Enter the Stream of the student : ");
		Streamname = sc.next();
		System.out.println("Enter the Subject of the student : ");
		subname = sc.next();
		System.out.println("Enter the internalmarks of the subject : ");
		intmarks = sc.nextInt();
		System.out.println("Enter the theorymarks of the subject : ");
		theorymarks = sc.nextInt();
		System.out.println();
		Subject sub1 = new Subject(subname, intmarks, theorymarks);

		System.out.println("Enter the Subject of the student : ");
		subname = sc.next();
		System.out.println("Enter the internalmarks of the subject : ");
		intmarks = sc.nextInt();
		System.out.println("Enter the theorymarks of the subject : ");
		theorymarks = sc.nextInt();
		System.out.println();
		Subject sub2 = new Subject(subname, intmarks, theorymarks);

		StudentVar stu2 = new StudentVar(name, roll, collegename, Streamname, sub1, sub2);

	}

}
