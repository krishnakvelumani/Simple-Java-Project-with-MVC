package com.n2s;

class A {

}

class B extends A {

}

public class ManualRun {

	public static void main(String[] args) {
		A a = new B();
		B b = (B)new A();
		
	}

}
