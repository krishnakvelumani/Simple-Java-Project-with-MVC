package com.n2s;

public class Inheritancejava {

	public static void main(String[] args) {
	C obj1 = new C();
	obj1.display3();
	obj1.display2();
	obj1.display1();
	}

}

class A1{
	public void display1() {
		System.out.println("one");
	}
}

class B1 extends A1{
	public void display2() {
		System.out.println("two");
	}
}

class C extends B1{
	public void display3() {
		System.out.println("three");
	}
}