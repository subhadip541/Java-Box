package com.aot.classobject;

class Program4 {
	int x;
	Program4(int x){
		this.x=x;
	}
	public static Program4 getobj() {
		return new Program4(24);
	}
	public static void main(String[] args) {
		Program4 p1=getobj();
		System.out.println(p1.x);
	}
}
