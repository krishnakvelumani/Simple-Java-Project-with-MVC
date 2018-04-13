package com.n2s.Collectionss;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetsample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("One");
		ts.add("two");
		ts.add("three");
		ts.add("four");
		ts.add("three");
		ts.add("two");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
	}

}
