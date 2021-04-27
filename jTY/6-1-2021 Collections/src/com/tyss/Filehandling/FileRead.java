package com.tyss.Filehandling;

import java.io.*;
/*import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;*/
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) throws FileNotFoundException {
		try{
			File fileread=new File("D:\\Bharath.csv");
			Scanner s=new Scanner(fileread);
			String str="";
			while(s.hasNextLine()){
				//System.out.println(s.nextLine());	
				str=s.nextLine();
				String [] a=str.split(",");
				System.out.println(a[0]+""+a[1]+""+a[2]);
			}
			s.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
