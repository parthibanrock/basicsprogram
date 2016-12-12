package com.niit.parthi;
import java.util.Scanner;
public class Sumofsquare {
 static int n,i,sum=1;
 
public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the integer");
	n=s.nextInt();
	System.out.println("enter the square");
	for(i=2;i<=n;i++)
	{
		sum=sum+(i*i);
	}
	System.out.println(sum)	;
}

}
