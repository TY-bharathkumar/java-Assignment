package com.Singlemthod.demo;

public class Thread4 extends Thread {
	SingleSynchronizedMethod s;
	public Thread4(SingleSynchronizedMethod s) {
		this.s=s;
	}
	public void run(){
		s.method();
	}
}
