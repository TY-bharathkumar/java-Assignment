package com.tyss.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListitrratorsWays {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(0);
		a.add(89);
		a.add(10);
		a.add(20*10);
		a.add(20/2);
		System.out.println("printing the elements of an array in list format ");
		System.out.println(a);
		
		
		System.out.println("using an for loop");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));	
		}
		System.out.println("===================");
		
		System.out.println("using for each loop-> only in forward traverse");
		for (Integer integer : a) {
			System.out.println(integer);
		}
		System.out.println("===================");
		
		System.out.println("using iterator ->traverse in forward direction ");
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("===================");
		
		System.out.println("using List iterator->traverrsing in  forward direction");
		ListIterator<Integer> lit=a.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("===================");
		
		System.out.println("usindg listIterator->traversing in backward direction");
		ListIterator<Integer>list=a.listIterator(a.size());
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}

	}
}
