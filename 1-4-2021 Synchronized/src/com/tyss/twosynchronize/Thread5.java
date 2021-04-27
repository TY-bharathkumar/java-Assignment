package com.tyss.twosynchronize;

public class Thread5 extends Thread{
	TwoSynchronize t;
	public Thread5(TwoSynchronize t) {
		this.t=t;
	}
	public void run(){
		t.twosynchronized1(6);
	}
}
