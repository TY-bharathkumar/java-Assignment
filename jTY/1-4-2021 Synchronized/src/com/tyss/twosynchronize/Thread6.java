package com.tyss.twosynchronize;

public class Thread6 extends Thread {
	TwoSynchronize t;
	public Thread6(TwoSynchronize t) {
		this.t=t;
	}
	public void run(){
		t.twosynchronized1(8);
	}
}
