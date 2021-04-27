package com.tyss.TreeMap.mp;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreesetClass {
	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer, String>();
		t.put(10, "string");
		t.put(30, "string");
		t.put(20, "string");
		t.put(5, "string");
		t.put(2, "string");
		t.put(90, "string");
		Set<Entry<Integer,String>> s=t.entrySet();
		for (Entry<Integer, String> entry : s) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
