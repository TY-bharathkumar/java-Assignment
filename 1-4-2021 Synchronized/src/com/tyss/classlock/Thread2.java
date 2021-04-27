package com.tyss.classlock;

public class Thread2  extends Thread{
	ClassLevelLock c;
	public Thread2(ClassLevelLock c) {
		this.c=c;
	}
	public void run(){
		c.classlock(6);
	}
}
