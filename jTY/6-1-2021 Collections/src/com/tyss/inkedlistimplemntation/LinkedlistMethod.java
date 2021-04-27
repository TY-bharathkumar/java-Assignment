package com.tyss.inkedlistimplemntation;

import java.util.LinkedList;

public class LinkedlistMethod {
	public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList();
		l.add(20);
		l.add(50);
		l.add(450);
		l.add(225);
		l.add(260);// add()  is usedto add objects
		System.out.println(l);
		l.add(2, 5);    // add(index,element) used to add element at a perticular index
		System.out.println(l);
		LinkedList<Integer> k=new LinkedList();
		k.add(45);
		k.add(50);
		k.add(0);
		k.add(-9);
		System.out.println(k);
		// addall(Collection<? extends Integer> c) add the content in one ll with another ll and returens true;
		System.out.println(k.addAll(l));
		System.out.println(k);
		//add all() add the content from one ll to another from the specified index 
		System.out.println(l.addAll(1, k));
		System.out.println(l);
		//addFirst(index)-> adds the specified value at first
		l.addFirst(-1);
		System.out.println(l);
		//addLast(index)-> add the specidfied object at last index
		l.addLast(-8);
		System.out.println(l);
		// clear() ->method removes the all methods in the linked list
		//l.clear();
		//System.out.println(l);
		//return l.contains(k) it comapares the element given as parameter
		System.out.println(l.contains(50));
		//l.containsAll(k) return 
		System.out.println(l.containsAll(k));
		// returns the first element in the linked list
		System.out.println(	l.peek());
		//returns the first element in the linked list
		System.out.println(l.peekFirst());
		//returns the last element in the linked list
		System.out.println(l.peekLast());
		//returns the l.poll() display the element of the list and removes the element
		System.out.println(l.poll());
		//returns the l.pollFirst() display the element of the list and removes the first  element
		System.out.println(l.pollFirst());
		//returns the l.pollLast() display the element of the list and removes the last element
		System.out.println(l.pollLast());
		// removes the first element in the linked list 
		System.out.println(l.pop());
		System.out.println(l);
	}
}
