package com.niit.parthi;
import java.util.Scanner;

public class Voteing {
	public static void main(String[] args)
	{
		String name;
		int age;//accept age
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		name=s.next();
		System.out.println("enter your age");
		age=s.nextInt();
		if(age>=18)
		{
			System.out.println(name+"Eligible to vote"+age);
		}
		else {
			System.out.println(name+"Not Eligible to vote"+age);
		}
	}

}
