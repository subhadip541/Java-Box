package com.aot.oops;

public class Program3 {
	public static void main(String[] args) {
		DScientist obj = new DScientist("Dip", 12, 58, 8, 8);
		System.out.println(obj);
	}
}

class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "Name-" + name + "\nId-" + id;
	}

}

class Scientist extends Employee {
	int no_of_publication;
	int experience;

	public Scientist(String name, int id, int no_of_publication, int experience) {
		super(name, id);
		this.no_of_publication = no_of_publication;
		this.experience = experience;
	}

	public String toString() {
		return super.toString() + "\nNo._of_publication -" + no_of_publication + "\nExperience - " + experience;
	}
}

class DScientist extends Scientist {
	int award;

	public DScientist(String name, int id, int no_of_publication, int experience, int award) {
		super(name, id, no_of_publication, experience);
		this.award = award;
	}

	public String toString() {
		return super.toString() + "\nAward-	" + award;
	}
}
