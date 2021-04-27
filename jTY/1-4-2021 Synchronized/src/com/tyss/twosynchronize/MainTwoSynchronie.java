package com.tyss.twosynchronize;

public class MainTwoSynchronie {
public static void main(String[] args) {
	TwoSynchronize a=new TwoSynchronize();
	Thread5 t5=new Thread5(a);
	Thread6 t6=new Thread6(a);
	t5.start();
	t6.start();
}
}
