package com.tyss.Hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet hash=new HashSet();
		hash.add(56);
		hash.add(25*3);
		hash.add(-1);
		hash.add(28);
		hash.add(56);
		hash.add(25-25);
		hash.add(25+58);
		System.out.println(hash);
		ArrayList<Integer> arrayList=new   ArrayList<Integer>(hash);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println(hash);
	}
}
