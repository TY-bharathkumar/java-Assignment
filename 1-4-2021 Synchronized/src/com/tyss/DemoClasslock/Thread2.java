package com.tyss.DemoClasslock;

public class Thread2 extends Thread{
	ClassLockDEmo d;
	public Thread2(ClassLockDEmo d) {
		this.d=d;
	}
	public void run(){
		d.checkpassword(4);
	}
}
