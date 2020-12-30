package com.aot.classobject;

public class Program5 {

	public static void main(String[] args) {
		First f1=new First(10);
		f1.show();
		}

}
class First{
	int x;
	First(int x){
		this.x=x;
	}
	void show() {
		System.out.println("Printing the element : "+this.x);
	}
}
