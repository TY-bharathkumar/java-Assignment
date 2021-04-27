package com.Threa.Textcast;

public class Customer2 extends Thread {
Bankacc b;

public Customer2(Bankacc b) {
	super();
	this.b = b;
}
 public void run(){
	 b.deposit(6000);
 }
}
