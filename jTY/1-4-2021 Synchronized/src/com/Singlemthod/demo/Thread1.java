package com.Singlemthod.demo;

public class Thread1 extends Thread {
	SingleSynchronizedMethod s;
	public Thread1(SingleSynchronizedMethod s) {
		this.s=s;
	}
	public void run(){
		s.method();
	}
}
