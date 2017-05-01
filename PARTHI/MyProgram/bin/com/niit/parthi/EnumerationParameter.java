package com.niit.parthi;

public class EnumerationParameter {
	

    public enum Color{RED,BLUE,GREEN};
    public static void main(String arg[])
    {
      new EnumerationParameter().setBackground(Color.BLUE);
    }   
    public void setBackground(Color ob)
    {
        System.out.println("Implementing in Method");
        switch(ob)
        {
            case RED:
                System.out.println("Applying RED Color");
                break;
            case BLUE:
                System.out.println("Applying Blue Color");
                break;
            case GREEN:
                System.out.println("Applying Green Color");
                break;
            default:
                System.out.println("Not the Correct Value");
        }
    
    }
		



}
