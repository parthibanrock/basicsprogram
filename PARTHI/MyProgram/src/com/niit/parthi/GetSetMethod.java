package com.niit.parthi;

public class GetSetMethod {
	
	private double width,depth,height;
	
	//getter method
	public double getWidth()
	{
		return width;
    }
	public double getHeight()
	{
		return height;
    }
	public double getDepth()
	{
		return depth;
    }

	//setter method
	public void setWidth(double w)
	{
		width=(w>0)?w:1;
	}
	public void setHeight(double h)
	{
		height=(h>0)?h:1;
	}
	public void setDepth(double d)
	{
		depth=(d>0)?d:1;
	}
}
