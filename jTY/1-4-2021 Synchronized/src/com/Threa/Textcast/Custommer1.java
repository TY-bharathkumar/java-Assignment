package com.Threa.Textcast;

public class Custommer1 extends Thread {
	Bankacc b;

	public Custommer1(Bankacc b) {
		super();
		this.b = b;
	}
	public void run(){
		b.withdraw(5000);;
	}
}
