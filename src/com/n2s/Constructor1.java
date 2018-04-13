package com.n2s;

public class Constructor1 {

	public static void main(String[] args) {
		
		//Constructor1 object = new Constructor1(1);
		new Child();
	}

	Constructor1(){
		System.out.println("I'm inside Constructor");
	}
	
	Constructor1(int i){
		this("Krishna");
		System.out.println("I'm inside integer Constructor");
	}
	
	Constructor1(String s){
		System.out.println("I'm inside String Constructor");
	}
}

class Child extends Constructor1{
	Child(){
		super("Stringgg");
		System.out.println("Inside child constructor");
	}
}