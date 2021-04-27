package com.tyss.Vector;

import java.util.Vector;

public class VectorMethos {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(25);
		v.add(0, 69);
		v.add(66);
		System.out.println("first vector "+v);
		Vector<Integer> k=new Vector<Integer>();
		k.add(69);
		k.add(99);
		k.add(1, 9);
		System.out.println(v);
		// capacity() indicates the size of the vector
		System.out.println(v.capacity());
		// addElement() adds the element at the last
		v.addElement(6);
		//elementAt return the element in the given array
		System.out.println(v.elementAt(1));
		//indexof() return the index of the entered array
		System.out.println(v.indexOf(69));
		System.out.println(v);
	}
}
