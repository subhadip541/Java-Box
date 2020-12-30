package com.aot.classobject;

public class StudentVar {

	String name;
	int roll;
	String collegeName;
	String stream;
	Subject[] sub;

	public StudentVar(String name, int roll, String collegeName, String stream) {
		this.name = name;
		this.roll = roll;
		this.collegeName = collegeName;
		this.stream = stream;
	}

	public StudentVar(String name, int roll, String collegeName, String stream, Subject... sub) {
		this.name = name;
		this.roll = roll;
		this.collegeName = collegeName;
		this.stream = stream;
		this.sub = sub;
	}

	void show() {

		System.out.println("Student name : " + name + "\tRoll no. : " + roll + "\tCollege Name : " + collegeName
				+ "\tStream : " + stream);
		int grandtotal = 0;
		for (int i = 0; i < sub.length; i++) {
			int totalMarks = sub[i].internalMarks + sub[i].theoryMarks;
			grandtotal += totalMarks;
			System.out.println("Subject name: " + sub[i].name);
		}
		System.out.println("GrandTotal Marks :  " + grandtotal);
	}
}
