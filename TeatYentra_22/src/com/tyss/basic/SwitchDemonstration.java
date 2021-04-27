package com.tyss.basic;

import java.util.Scanner;

public class SwitchDemonstration {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter case as above format");
		System.out.println("0)if\n 1)if_else\n 2)nested_if \n 3)switch \n 4)for \n 5)while \n 6)do_while ");

		int choice=s.nextInt();

		switch(choice){
		case 0:
			System.out.println("if syntax \n");
			System.out.println("if(condition)\n{\n}");
			break;
		case 1:
			System.out.println("if _else syntax");
			System.out.println("if(Condition)\n{\n}else\n{\n}");
			break;
		case 3:
			System.out.println("nested_ if");
			System.out.println("if(condition)\n{ \n} \nif(condition)\n{\n}\n else\n {\n}\n");
			break;
		case 4: 
			System.out.println("switch");
			System.out.println("switch(condition)\n case1:\nbreak;\n case n:\n break;\n default: \n statemt\n");
			break;
		case 5:
			System.out.println("for");
			System.out.println("for(init;condition;incr/decr)\n{\n}");
			break;
		case 6:
			System.out.println("while");
			System.out.println("while(condition)\n{\nstatemants\n}");
			break;
		case 7:
			System.out.println("do_while");
			System.out.println("do\n{\n}\nwhile(condition);");
			break;
		default :
			System.out.println("invalid");
		}
		s.close();
	}

}