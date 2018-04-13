package com.n2s;

public class StringSample1 {

	public static void main(String[] args) {
			String s1 ="SACHIN";
			//s= s.concat("TENDULKAR");
			
			String s2=new String("SACHIN");
			
			String s3=new String("SACHIN");
			//System.out.println(s);
			
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			System.out.println(s2==s3);
	}

}

class