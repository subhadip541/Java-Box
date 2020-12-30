package com.aot.oops;

public class Program2 {

	public static void main(String[] args) {

		Area a1 = new Area(10, 20);
		System.out.println("Area = " + a1.calArea());
		Volume v1 = new Volume(10, 20, 30);
		System.out.println("Volume = " +v1.calvolume());
	}
}

class Area {
	int length, width;

	Area(int length, int width) {
		this.length = length;
		this.width = width;
	}

	int calArea() {
		return length * width;
	}
}

class Volume extends Area {
	int height;

	Volume(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}

	int calvolume() {
		return length * width * height;
	}
}
