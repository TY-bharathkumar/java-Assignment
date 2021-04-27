package com.tyss.stack;

import java.util.Stack;

public class StackMethods {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
	// stack has all implementation class as list
		s.push(6);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(0);
		s.push(-1);
		System.out.println(s);
//removes the element from the stack from the last
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);
		//s.peek()  method returns the last element present in the stack
		System.out.println(s.peek());
		System.out.println(s);
		
	}
}
