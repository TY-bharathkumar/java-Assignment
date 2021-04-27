package com.tyss.Hashtable.map;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableClass {
	private static String defaultValue;

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(20, "String1");
		ht.put(10, "String2");
		ht.put(30, "String3");
		ht.put(50, "String4");
		ht.put(40, "String5");
		ht.put(10, "String6");
		ht.put(10, "String7");
		
		System.out.println(ht.getOrDefault(1, defaultValue));
		//Set<Entry<Integer,String>> s=ht.entrySet();
		/*for (Entry<Integer, String> entry : s) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		System.out.println(ht);
		System.out.println(ht.entrySet());
	}
}
