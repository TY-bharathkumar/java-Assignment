package com.tyss.DemoClasslock;

public class Thread1 extends Thread {
	ClassLockDEmo d;
	public Thread1(ClassLockDEmo d) {
		this.d=d;
	}
	public void run(){
		d.checkpassword(5);
	}
}
