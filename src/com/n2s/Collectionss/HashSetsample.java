package com.n2s.Collectionss;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetsample {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("three");
		hs.add("two");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
