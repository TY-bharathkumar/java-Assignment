package com.Threa.Textcast;

public class Bankacc {
	int balence =1000;
	synchronized public void withdraw(int amount){
		System.out.println("account balence"+balence);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(amount>balence){
			System.out.println("insufficient balence wait till deposit happens");
			try {
				Thread.sleep(2000);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balence=balence-amount;
			System.out.println("you are withdrawn amoubt is"+balence);
		}
		else {
			
			System.out.println("you are withdrawn amount");
		}
	}
	synchronized public void deposit(int amount){
		System.out.println("deposit in process");
		balence+=amount;
		System.out.println("deposit is successful");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}
}
