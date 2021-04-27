package com.tyss.Filehandling;
import java.io.*;
public class FileCreation {
	public static void main(String[] args) throws IOException {
		try{
			File file=new File("D:\\Bharath.csv");

			if(file.createNewFile()){
				System.out.println("file has been created "+file.getName());
			}
			else{
				System.out.println("file cannot be created ");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
