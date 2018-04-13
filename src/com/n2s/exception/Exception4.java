package com.n2s.exception;

public class Exception4 {

	public static void main(String[] args) {
		
	int age = 16;
	
	if (age<18) 
		throw new ArithmeticException("Invalid age to vote");
	else 
		System.out.println("Valid age");
	
	}

}
