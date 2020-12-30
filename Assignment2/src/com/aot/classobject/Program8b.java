package com.aot.classobject;

import java.util.Scanner;

public class Program8b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		Student[] stuarr = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name of the student : ");
			String name = sc.next();
			System.out.println("Enter the roll of the student : ");
			int roll = sc.nextInt();
			System.out.println("Enter the College name of the student : ");
			String collegename = sc.next();
			System.out.println("Enter the Stream of the student : ");
			String Streamname = sc.next();
			Subject[] subarr = new Subject[6];
			for(int j=0;j<6;j++) {
				System.out.println("Enter the Subject of the student : ");
				String subname = sc.next();
				System.out.println("Enter the internalmarks of the subject : ");
				int intmarks = sc.nextInt();
				System.out.println("Enter the theorymarks of the subject : ");
				int theorymarks = sc.nextInt();
				System.out.println();
				Subject sub=new Subject(subname,intmarks,theorymarks);
				subarr[j]=sub;
			}
			Student stu=new Student(name, roll, collegename, Streamname,subarr);
			stuarr[i] = stu;
		}
		for (int i = 0; i < n; i++) {
			stuarr[i].show();
			System.out.println();
		}
	}

}
