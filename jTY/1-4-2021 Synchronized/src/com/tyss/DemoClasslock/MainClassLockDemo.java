package com.tyss.DemoClasslock;

public class MainClassLockDemo {
	public static void main(String[] args) {
		ClassLockDEmo k=new ClassLockDEmo();
		Thread1 e=new Thread1(k);
		Thread2 e1=new Thread2(k);
		e.start();
		e1.start();
	}
}
