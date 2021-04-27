package com.tyss.collectionlist_v1;

public class ArrayMethodUsing {
	public static void main(String[] args) {
		MyArray a=new MyArray();

		for (int i = 0; i <5; i++) {
			a.add(i+2);
		}
		
		a.remove(1);

		for (int i = 0; i < 5; i++) {
			System.out.println(a.get(i));
		}

		a.search(2);
	}
}
