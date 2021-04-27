package com.Singlemthod.demo;

public class MainSingleSynchronized {
	public static void main(String[] args) {


		SingleSynchronizedMethod l=new SingleSynchronizedMethod();

		Thread1 t1=new Thread1(l);
		Thread2 t2=new Thread2(l);
		Thread3 t3= new Thread3(l);
		Thread4 t4= new Thread4(l);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}