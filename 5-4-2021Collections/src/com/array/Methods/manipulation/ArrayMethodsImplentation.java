package com.array.Methods.manipulation;

public class ArrayMethodsImplentation {
	public static void main(String[] args) {
		Myarray c=new Myarray();
		System.out.println("size of the array is "+c.size());
		for (int i = 0; i < 5; i++) {
			c.add(i+1);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(c.get(i));
		}
		c.remove(0);
		c.remove(1);
		/*c.remove(2);
		c.remove(3);
		c.remove(4);*/
		System.out.println("new array after deleting an element");
		for (int i = 0; i < 5; i++) {
			System.out.println(c.get(i));
		}
		c.search(4);
		System.out.println();
		System.out.println("size of the array is "+c.size());
	}
}
