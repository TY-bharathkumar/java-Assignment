package assignments;

import java.util.Scanner;

public class DuplicateParanthasis {


	public static void test(String str)
	{
	for (int i = 0; i < str.length()-2; i++)
	{
	if(str.charAt(i)=='(' && str.charAt(i+1)=='(' && str.charAt(i+2)!='(' )
	{
	for (int j = i+2; j < str.length()-1; j++)
	{
	if(str.charAt(j)==')' && str.charAt(j+1)!=')')
	{
	break;
	}
	if(str.charAt(j)==')' && str.charAt(j+1)==')' )
	{
	System.out.println(str.substring(i+2, j));

	}
	}
	}
	}
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter input : ");
	String str=sc.next();
	           test(str);
	}

	}

