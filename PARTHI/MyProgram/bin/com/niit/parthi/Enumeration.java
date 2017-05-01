package com.niit.parthi;

public class Enumeration {
	
	    public enum color{RED,BLUE,GREEN,};
	    
	    public static void main(String arg[])
	    {
	       // System.out.println("First Enumeration Object of Color :"+Color.RED);
	        
	        color ob=color.RED;
	        
	       // System.out.println("An Enumeration Object:"+ob);
	        
	        System.out.println("Enumeration Objects Ordinal Values:"+ob.ordinal());
	    }
	}


