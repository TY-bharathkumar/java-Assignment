package com.tyss.onesynchronize;

public class Thread4 extends Thread {
	Onesynchronize o;
	public Thread4(Onesynchronize o) {
		this.o=o;
	}
public void run(){
	o.twosynchronized(10);
}
}
