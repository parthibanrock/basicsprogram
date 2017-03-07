package com.niit.parthi;
import java.io.*;
import java.util.Scanner;
public class FileIO {
           public static void main(String [] arg)
           {
        	   try
        	   {
        		 FileOutputStream fos =new  FileOutputStream("C:\\eclipse\\file\\stream.txt");
        		 //String str= "enter your name ";
        		 System.out.println("Enter Your Name");
        		
                 Scanner obj = new Scanner(System.in);
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               
                 String str=br.readLine();
                 byte[]b=str.getBytes();
        		 fos.write(b);
                
        		 System.out.println("wriiten has succesfull");
        	   }
        			 catch(Exception e)
        			 {
        				System.out.println(e) ;
        			 }
        		 }
        	   
           }

