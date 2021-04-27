package com.tyss.basic;

import java.io.IOException;

public class KeyboardINput {
	public static void main(String[] args) {

		/*		char ch=' ';

		System.out.println("enter a charecter...");
		try{
			while(ch!='k'){
				ch=(char)System.in.read();
			}
			System.out.println("you entered... "+ch);

			System.out.println("your guess is k");

		}
		catch (IOException e){
			e.printStackTrace();
		}*/

		char ch=' ';

		System.out.println("enter a charecter...");
		try{

			while(ch!='q'){
				ch=(char)System.in.read();
			}
			System.out.println("you entered... "+ch);

			System.err.println("exit");
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}


}


