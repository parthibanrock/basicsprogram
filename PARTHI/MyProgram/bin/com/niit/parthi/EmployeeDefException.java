package com.niit.parthi;

public class EmployeeDefException {
	public void check(int i) throws IDCheckException
	{
		if (i==5)
		{
			System.out.println("display the id");
		}
		 else
		{
			System.out.println("character missing");
		}
		
	}
	  public void validate( int j) throws SalaryValidateException
			  {
		       if(j<=10000)
		       {
		    	   System.out.println("salary is 10000");  
		       }
		       else
		       {
		    	   System.out.println("exceed of 10000");
		       }
			  }
	  public void check(String k) throws StringCheckException
	  {
		 // string str=new string();
        if(k=="india")
       {
    	   System.out.println("salary is 10000");  
       }
       else
       {
    	   System.out.println("exceed of 10000");
       }
	  }
	
      
   public static void main(String []arg){
	     EmployeeDefException Iobj=new EmployeeDefException();
	     try
	     {
	    	 Iobj.check(5);
	     }
	     catch(IDCheckException obj)
	     {
	    	System.out.println(obj) ;
	    	
	     }
	     EmployeeDefException Sobj=new EmployeeDefException(); 
	     try
	     {
	    	 Sobj.validate(15000);
	     }
	     catch(SalaryValidateException obj1)
	     {
	    	System.out.println(obj1) ;
	    	
	     }
   }
   
}

