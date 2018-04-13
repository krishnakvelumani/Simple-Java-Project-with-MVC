package com.n2s.singleton;

public class Singleton {
	
	private static Singleton st = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance(){
		
		if(st==null) {
			
			st= new Singleton();
			System.out.println("Object is created");
			
		}
		
		else {
			System.out.println("Object is already created, providing copy");
		}
		
		return st;
	}
	
	public static void display() {
		System.out.println("Display from Singleton");
	}
}
