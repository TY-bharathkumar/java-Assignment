package com.tyss.linkedhashmap.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedhashmapClass {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer,String>();
	l.put(10, "manam");
	l.put(20,"Bank");
	Set<Entry<Integer,String>> s=l.entrySet();
	for (Entry<Integer, String> entry : s) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
}
}
