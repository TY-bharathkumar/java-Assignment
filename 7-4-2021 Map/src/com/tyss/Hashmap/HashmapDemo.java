package com.tyss.Hashmap;
import java.util.*;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(10, "Banglore");
		hm.put(20, "mysore");
		hm.put(30, "davanagiri");
		hm.put(40, "Belgam");
		hm.put(50, "chik Mangalur");
		hm.put(60, "halli");


		Set<?> set=hm.entrySet();
		/*set represents in a set value*/
		System.out.println(set);
		Iterator<?> itr=set.iterator();
		System.out.println("using while loop\n");
		while(itr.hasNext()){
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
//		System.out.println("using for-each loop\n");
//		Set<Entry<Integer, String>> entries=hm.entrySet();
//		for (Entry<Integer, String> entries1 : entries) {
//			System.out.println(entries1.getKey());
//			System.out.println(entries1.getValue());
	//}

	}
}
