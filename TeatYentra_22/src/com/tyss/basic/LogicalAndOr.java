package com.tyss.basic;

import java.io.IOException;
import java.util.Scanner;

public class LogicalAndOr {
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("|  p  |\t|  q  |\t|  p&&q | |  p||q  |");
		int i=4;
		while(i>=1){
			int p=s.nextInt();
			int q=s.nextInt();
			int x=0;
			int y=0;
			if(p==1&&q==1){
				x=1;
			}
			else{
				x=0;
			}
			if(p==1||q==1){
				y=1;
			}
			else{
				y=0;
			}
			System.out.println(p+"\t"+q+"\t"+x+"\t"+y);
			i--;
		}

s.close();
	}
}
