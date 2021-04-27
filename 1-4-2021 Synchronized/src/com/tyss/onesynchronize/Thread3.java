package com.tyss.onesynchronize;

public class Thread3 extends Thread{
	Onesynchronize o;
	public Thread3(Onesynchronize o) {
		this.o=o;
	}
public void run(){
	o.twosynchronized(5);
}
}
