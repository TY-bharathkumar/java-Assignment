package com.tyss.basic;

public class Operatee2 {
	public static void main(String[] args) {
		int a=5,b=2,c=1;
		int m=++a*5;
		int n=b++-c*2;
		System.out.println(m);
		System.out.println(n);
		
		int x=10,y=2,p=2;
		p*=x/y;
		System.out.println(p);
	}
}