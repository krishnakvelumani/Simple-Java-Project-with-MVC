package com.n2s;

public class Example {

	public static void main(String[] args) {
		int x=4;
		++x;
		System.out.println(x);
		Example e = new Example();
		e.display();
		int output=e.addition(5, 10);
		System.out.println("output is "+ output);
	}
	
	public void display() {
		System.out.println("I'm inside the display method");
	}
	
	public int addition(int x,int y) {
		int result=x+y;
		return result;
	}
}

