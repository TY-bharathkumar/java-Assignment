package com.Threa.Textcast;

public class MainBankAccc {
	public static void main(String[] args) {


		Bankacc k=new Bankacc();
		Custommer1 c1=new Custommer1(k);
		Customer2 c2=new Customer2(k);
		c1.start();
		c2.start();
	}
}