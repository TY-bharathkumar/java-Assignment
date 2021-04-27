package com.tyss.synchronize;

public class Thread2 extends Thread {
	SynClass s;

	public Thread2(SynClass s) {
		this.s=s;
	}
	public void run(){
		s.greater(20);
	}
}
