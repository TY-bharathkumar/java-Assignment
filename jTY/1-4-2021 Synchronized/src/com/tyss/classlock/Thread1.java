package com.tyss.classlock;

public class Thread1 extends Thread{ 
	ClassLevelLock c;
	public Thread1(ClassLevelLock c) {
		this.c=c;
	}
	public void run(){
		c.classlock(5);
	}
}
