package com.niit.parthi;
import javax.swing.JFrame;
public class Frame {
     JFrame obj;
    
     public Frame(){
    		 
    	 obj=new JFrame();
    	 obj.setTitle("hello world");
    	 obj.setVisible(false);
    	 obj.setSize(300,300);
     }
  
	public static void main(String[] args) {
	
        Frame obj=new Frame();
     
	}


}
