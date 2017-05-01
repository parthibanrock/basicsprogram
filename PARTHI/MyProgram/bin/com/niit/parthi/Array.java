package com.niit.parthi;

public class Array {
	public static void main(String[] args) {
           int number1=0;
           int number2=0;
           int[] Array=new int []{0,1,2,3,4,5,6,7,8,9,10,11};
           for(int ctr:Array)
           {
        	   if(ctr%2==1)
        	   {
        		   number1++;
        	   }
        	   else
        	   {
        		   number2++;
        		   System.out.println(ctr);
        	   }
           }
         
	}
}
		
	


