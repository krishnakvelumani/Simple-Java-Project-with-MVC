package com.n2s.Collectionss;

import java.util.HashMap;
import java.util.Map;

public class HashMapsample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(100,"Krishna");
		hm.put(102,"Naveen");
		hm.put(104, "Sohi");
		hm.put(null, "Vijay");
		hm.put(106, "Vijay");
		hm.put(null, "Krishna");
		hm.put(107, null);
		hm.put(108, null);
		
		for(Map.Entry<Integer,String> me : hm.entrySet()) {
			System.out.println(me.getKey()+"   "+me.getValue());
		}
	}

}
