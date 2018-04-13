package com.n2s.exception;

public class Exception1 {

	public static void main(String[] args) {
		
		try {
			int i=20;
			
			i=20/0;
			
			System.out.println("the value of i is"+ i);
		}
		catch(Exception e){
			System.out.println("Inside the Catch block"+e);
		}
		
		
		
		System.out.println("Welcome");
	}

}
