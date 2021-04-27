package com.tyss.basic;

public class BitwiseDemo {
	public static void main(String[] args) {


		int a=4;
		int b=2;
		int c=3;
		a|=4;
		b>>=1;
		c>>=1;
		a^=c;
		System.out.println("or operation results  " + a);
		System.out.println("or operation results  " + b);
		System.out.println("or operation results  " + c);
		System.out.println("or operation results  " + a);
	}
}
