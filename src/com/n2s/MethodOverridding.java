package com.n2s;

public class MethodOverridding extends SampleOver {

	public static void main(String[] args) {
		String s= 5;
		String s= "str";
		MethodOverridding obje1= new MethodOverridding();
		obje1.display();
	}
	public void display() {
		System.out.println("I'm in  method overridding");
	}

}

class SampleOver{
	
	public void display() {
		System.out.println("I'm in SampleOver method");
	}
	
}