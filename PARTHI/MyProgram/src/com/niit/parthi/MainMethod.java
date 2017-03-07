package com.niit.parthi;

public class MainMethod {

	public static void main(String[] args) {
		
	 Box obj=new Box();
	
	obj.width=13;
	obj.height=56;
	obj.depth=42;
	
	double volume;
	volume=obj.width*obj.height*obj.depth;
	
	
	System.out.println("the volume of box:"+volume);
	

	}

}
