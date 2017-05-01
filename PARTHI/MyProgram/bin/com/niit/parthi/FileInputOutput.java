package com.niit.parthi;
import java.io.*;
import java.nio.file.*;

public class FileInputOutput {
	public static void main(String []arg)
	{
		try
		{
		FileWriter fw=new FileWriter("E:\\JAVA\\FILE\\Newfile.txt");
	
		Path p=Paths.get("E:\\JAVA\\FILE\\Newfile.txt");
     
         System.out.println(Files.isDirectory(p));
     }
     catch(Exception e){
         System.out.println(e);
		 
	    }
	}

}
