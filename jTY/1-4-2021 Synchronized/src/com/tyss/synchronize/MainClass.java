package com.tyss.synchronize;

public class MainClass {

	public static void main(String[] args) {
		SynClass sync=new SynClass();
		Thread1 syn=new Thread1(sync);
		Thread2 syn1= new Thread2(sync);
		syn.start();
		syn1.start();
	}

}
