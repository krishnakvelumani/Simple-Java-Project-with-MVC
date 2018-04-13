package com.n2s.Collectionss;

import java.util.Hashtable;
import java.util.Map;

public class HashTablesample {

	public static void main(String[] args) {

		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	
		ht.put(100,"Krishna");
		ht.put(102,"Naveen");
		ht.put(104, "Sohi");
	//	ht.put(null, "Vijay");
		ht.put(106, "Vijay");
	//	ht.put(null, "Krishna");
	//	ht.put(107, null);
	//	ht.put(108, null);
		
		for(Map.Entry<Integer,String> me : ht.entrySet()) {
			System.out.println(me.getKey()+"   "+me.getValue());
		}
		
	}

}
