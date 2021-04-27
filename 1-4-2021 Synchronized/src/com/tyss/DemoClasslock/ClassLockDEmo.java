package com.tyss.DemoClasslock;

public class ClassLockDEmo {
	synchronized static void checkpassword(int n){
		for(int i=0;i<n;i++){
			System.out.println(n+i);
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

}
