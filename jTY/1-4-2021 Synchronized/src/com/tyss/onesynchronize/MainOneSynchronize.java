package com.tyss.onesynchronize;

public class MainOneSynchronize {
	public static void main(String[] args) {
		Onesynchronize s=new Onesynchronize();
		Thread3 t=new Thread3(s);
		Thread4 t1=new Thread4(s);
		t.start();
		t1.start();
		
	}
}
