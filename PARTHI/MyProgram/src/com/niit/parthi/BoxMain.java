package com.niit.parthi;

public class BoxMain {
	
	public static void main(String[]arg){
		
	GetSetMethod obj=new GetSetMethod();
	
	obj.setWidth(-6);
	obj.setHeight(5);
	obj.setDepth(5);
	
	double volume;
	volume=obj.getWidth()*obj.getHeight()*obj.getDepth();
	
	
	System.out.println("the volume of box:"+volume);
	
	}
}
