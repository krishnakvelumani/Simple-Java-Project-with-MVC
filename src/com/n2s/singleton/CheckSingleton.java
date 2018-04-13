package com.n2s.singleton;

public class CheckSingleton {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		s1.display();
		s2.display();
		s3.display();
		
	}

}
