package com.tyss.basic;

public class WhileWxponr {
	public static void main(String[] args) {
		int base=-3;
		int exponent=3;
		int result=base;
		while(exponent>1){
			result=result*base;
			exponent--;		
		}
		System.out.println(result);
	}
}
