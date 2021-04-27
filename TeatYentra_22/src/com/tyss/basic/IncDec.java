package com.tyss.basic;

public class IncDec {
public static void main(String[] args) {
	int a=10,b=5,c=1;
	int result=a-++c-++b;
	System.out.println(result);
	System.out.println(a-c++-b++);
}
}
