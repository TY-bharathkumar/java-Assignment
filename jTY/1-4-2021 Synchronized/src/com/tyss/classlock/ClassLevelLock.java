package com.tyss.classlock;

public class ClassLevelLock {
	synchronized static void classlock(int n){

		for(int i=0;i<=n;i++){
			System.out.println(i);

		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

}
