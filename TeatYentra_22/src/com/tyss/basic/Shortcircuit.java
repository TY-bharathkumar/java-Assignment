package com.tyss.basic;

public class Shortcircuit {
public static void main(String[] args) {
	if(false&&true){
		System.out.println("the if part not gonna print");
	}
	else{
		System.out.println("this else part will print");
	}
	if(true||false){
		System.out.println("this if part gonna print");
	}
	else {
		System.out.println("this else not gonna print");
	}
	
	//testing
}
}
