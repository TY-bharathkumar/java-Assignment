package com.tyss.synchronize;

public class Thread1 extends Thread{
	SynClass s;
	public Thread1(SynClass s) {
		this.s=s;
	}
	public void run (){
		s.greater(10);
	}
}
