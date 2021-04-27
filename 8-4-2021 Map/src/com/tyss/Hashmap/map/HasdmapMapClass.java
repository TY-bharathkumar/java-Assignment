package com.tyss.Hashmap.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HasdmapMapClass {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(0, "flskfksjf");
		h.put(10, "Bharath");
		h.put(20, "String");
		h.put(80, "String");
		h.put(90, "String");

		Set<Entry<Integer,String>> s=h.entrySet();
		Iterator<Entry<Integer, String>> itr=s.iterator();
		for (Entry<Integer, String> entry : s) {
		//while(itr.hasNext()){
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				//System.out.println(entry.getClass());
		//}
		}

	}

}
