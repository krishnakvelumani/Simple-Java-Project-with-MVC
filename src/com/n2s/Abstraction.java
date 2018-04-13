package com.n2s;

public class Abstraction extends Myabstract {

	public static void main(String[] args) {
		
	}

	@Override
	public String display2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String display3() {
		// TODO Auto-generated method stub
		return null;
	}

}

abstract class Myabstract{
	
	public void display1() {
		
		System.out.println("Display1");
	}
	
	public abstract String display2();
	public abstract String display3();

}