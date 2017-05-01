package com.niit.parthi;
class Myclass extends Thread{
	
	
	public void run(){
		
		
		for(int i=1; i<=10; i++);
		{
		
		System.out.println();
		}
	}
}
public class MyThread {

		public static void main(String [] arg)
		{
			Myclass obj=new Myclass();
			obj.start();
		}

	}



