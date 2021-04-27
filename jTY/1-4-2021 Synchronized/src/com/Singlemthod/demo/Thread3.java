package com.Singlemthod.demo;

public class Thread3 extends Thread {
	SingleSynchronizedMethod s;
	public Thread3(SingleSynchronizedMethod s) {
		this.s=s;
	}
	public void run(){
		s.method();
	}
}
