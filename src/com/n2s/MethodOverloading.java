package com.n2s;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading object1= new MethodOverloading();
		object1.display(55);
		object1.display("JAVA");
		object1.display("HELLO", 1000);
		
	}

	public  void display(int i) {
		System.out.println("integer--"+i);
		
	}
	public  void display(String s) {
		System.out.println("string--"+s);
	}
	
	public  void display(String s,int i) {
		System.out.println("string--"+s +"integer"+i );
	}
}
