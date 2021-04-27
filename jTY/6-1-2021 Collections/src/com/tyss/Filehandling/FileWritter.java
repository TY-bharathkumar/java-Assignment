package com.tyss.Filehandling;

import java.io.IOException;
import java.io.*;

public class FileWritter {
	public static void main(String[] args) {
		try{
			FileWriter filewritter=new FileWriter("D:\\Bharath.csv");
			filewritter.write("Life ,should ,be ,more \n then ,just ,surviving");
			filewritter.close();
			System.out.println("file has been written suessfully");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
