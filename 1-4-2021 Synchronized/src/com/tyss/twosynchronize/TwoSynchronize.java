package com.tyss.twosynchronize;

public class TwoSynchronize {
	public void twosynchronized1(int n){

		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
			for (int i=0;i<10;i++){
				System.out.println(n+" ");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		synchronized(this) {
			System.out.println(Thread.currentThread().getName());
			for(int j=0;j<4;j++){
				System.out.println(j+" ");
			}
			System.out.println();
		}

		System.out.println(Thread.currentThread().getName());
		for(int j=0;j<10;j++){
			System.out.println(j+" ");
		}
		System.out.println();

	}


}


