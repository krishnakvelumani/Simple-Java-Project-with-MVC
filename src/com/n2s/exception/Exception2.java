package com.n2s.exception;

public class Exception2 {

	public static void main(String[] args) {
		
		//String s = null;
		String s = "NAME";
		int i = 20;
	
		try {
			System.out.println(s.length());
			System.out.println("NEXT");
			i=20/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			System.out.println("Inside Arithmetic catch"+ e);
		}
		catch(NullPointerException e1) {
			System.out.println("Inside Nullpointer catch"+ e1);
		}
		catch(Exception e3) {
			System.out.println("Inside MAIN catch"+ e3);
		}
	}

}
