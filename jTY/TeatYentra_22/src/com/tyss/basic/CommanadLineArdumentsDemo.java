package com.tyss.basic;

public class CommanadLineArdumentsDemo {
public static void main(String[] args) {
	
	if(args.length==0){
		System.out.println("command line argumrnt is not present");
		}
	else {
		System.out.println("arguments are present in commandline arguements");
		System.out.println("=================================================");
		System.out.println();
		System.out.println("There are "+args.length+" command line arguments is");
		System.out.println("they are : ");
		for(int i=0;i<args.length;i++){
			System.out.println("args["+i+"]:" +args[i]);
		}
	}
}
}
