package com.ngk.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.*;


public class DBconnection {
	String url="jdbc:mysql://localhost:3306/company";
	String username="root";
	String password="mysqlroot";
	String sql="select empuname,emppass from credentials where empuname=? and emppass=?";

	public boolean check(String uname,String pass) {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection(url, username, password);
			//System.out.println("connection established");

			PreparedStatement stm= con.prepareStatement(sql);
			stm.setString(1, uname);
			stm.setString(2, pass);
			ResultSet set=stm.executeQuery();
			
			if(set.next()) {
				
				return true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return false;
		

	}
	

}
