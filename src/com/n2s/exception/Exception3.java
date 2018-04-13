package com.n2s.exception;

public class Exception3 {

	public static void main(String[] args) {
		
		try {
			int i=20;
			i=20/0;
			System.out.println(i);
		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//			System.out.println("Inside Arithmetic");
//		}
		finally {
			System.out.println("Closing all connections");
			System.out.println("Final is doone");
		}
		System.out.println("Still the flow");
	}

}
