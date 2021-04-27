package com.Singlemthod.demo;

public class Thread2 extends Thread {
	SingleSynchronizedMethod s;
	public Thread2(SingleSynchronizedMethod s) {
		this.s=s;
	}
	public void run(){
		s.method();
	}
}
