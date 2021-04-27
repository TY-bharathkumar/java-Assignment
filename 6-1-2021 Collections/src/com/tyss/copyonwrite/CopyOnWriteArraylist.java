package com.tyss.copyonwrite;
import  java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
// this code is for assining values to the array list while iteration
public class CopyOnWriteArraylist {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> a=new CopyOnWriteArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(0);
		a.add(89);
		a.add(10);
		a.add(20*10);
		a.add(20/2);

		Iterator i=a.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			a.add(2);
		}
		System.out.println(a);
	
	}

}
