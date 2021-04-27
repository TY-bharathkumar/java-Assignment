package com.tyss.basic;
import static java.lang.Math.*;
public class QuadraticRoots {
	public static void main(String[] args) {
		double root1,root2;
		int a=4,b=1,c=3;
		root1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		root2=((-b-Math.sqrt(b*b-4*a*c))/(2*a));
		System.out.println("first root of quadratic eqauion id  "+root1);
		System.out.println("first root of quadratic eqauion id  "+root2);
	}
}
