package com.n2s.Collectionss;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapsample {

	public static void main(String[] args) {
	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(100,"Krishna");
		tm.put(102,"Naveen");
		tm.put(104, "Sohi");
		tm.put(null, "Vijay");
		tm.put(106, "Vijay");
		tm.put(null, "Krishna");
		tm.put(107, null);
		tm.put(108, null);
	
		for(Map.Entry<Integer,String> me : tm.entrySet()) {
			System.out.println(me.getKey()+"   "+me.getValue());
		}
		
//		String[] names = {"one","two","three"};
//		for(String s : names)
//		{
//			System.out.print(s);
//		}
	
	}

}
