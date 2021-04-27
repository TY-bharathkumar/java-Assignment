package assignments;

import java.util.Scanner;

public class EncodeDcode {

	public static void Encode(String str,int k)
	{

		String s="";
		for (int i = 0; i < str.length(); i++)
		{
			int j=str.charAt(i);
			char b=(char)(j^k);
			s=s+b;
		}
		System.out.println("your code is encoded to "+s);
	}
	public static void Decode(String str1,int k)
	{

		String s="";
		for (int i = 0; i < str1.length(); i++)
		{
			int j=str1.charAt(i);
			char b=(char)(j^k);
			s=s+b;
		}
		System.out.println("your code is decoded to "+s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What u want Decode or Encode ");
		String a=sc.next();
		if(a.equalsIgnoreCase("encode"))
		{
			System.out.println("Enter code:");
			String b=sc.next();
			System.out.println("Enter key:");
			int c=sc.nextInt();
			Encode(b,c);
		}
		else if(a.equalsIgnoreCase("decode"))
		{
			System.out.println("Enter code:");
			String b=sc.next();
			System.out.println("Enter key:");
			int c=sc.nextInt();
			Decode(b,c);
		}
		else
		{
			System.out.println("entered wrong input");
		}

	}

}