package com.n2s;

import java.util.Scanner;

public class InputSample {

	static int i,j;
	static String s;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number1");
		i=scan.nextInt();
		
		System.out.println("Enter number2");
		j=scan.nextInt();
		
		System.out.println("Enter name");
		s=scan.next();
		
		System.out.println(i+j);
		System.out.println(s);
		
		scan.close();
	}

}
