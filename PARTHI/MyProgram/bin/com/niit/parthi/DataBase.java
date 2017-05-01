package com.niit.parthi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class DataBase {

	public static void main(String[] args) 
	{
		 try{
	            Connection con = DriverManager.getConnection("jdbc:h2://localhost:1527/sample", "app", "app");
	            PreparedStatement stmt = con.prepareStatement("select * from Customer where Customer_ID between ? and ?");
	            Scanner obj =new Scanner(System.in);
	            System.out.println("Enter Customer ID");
	            int id = obj.nextInt();
	            System.out.println("Enter Next Customer ID");
	            int id2 = obj.nextInt();
	            stmt.setInt(1, id);
	            stmt.setInt(2, id2);
	            ResultSet rs = stmt.executeQuery();
	            while(rs.next()){
	                System.out.println(rs.getString("NAME"));
	                System.out.println(rs.getString("City"));
	            }

	
	}
    catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.getCause());
    }    
}
}
