package com.tyss.synchronize;

public class SynClass extends Thread{
	public void greater(int n){

		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
			for (int i=0;i<10;i=i+2){
				System.out.println(n+" ");
			}
		System.out.println();
			System.out.println(Thread.currentThread().getName());
			for(int j=0;j<5;j=j+2){
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}
}
