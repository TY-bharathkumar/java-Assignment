package com.tyss.classlock;

public class MainClassLock {
	public static void main(String[] args) {
		ClassLevelLock r=new ClassLevelLock();
		Thread1 r1=new Thread1(r);
		Thread2 r2=new Thread2(r);
		r1.start();
		r2.start();
	}
}
