package com.tyss.onesynchronize;


public class Onesynchronize  {
	public void twosynchronized(int n){

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

	}
}
