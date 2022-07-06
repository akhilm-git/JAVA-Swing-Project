package com.form;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyDatabase {

//	protected static Object ps;
//	protected static Object ei;

	public static void SignUpwindow(ArrayList<String> data) {
		String fn,ln,ei,ps;
		// TODO Auto-generated method stub
		String  jdbcUrl="jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3390000\\usersdb.db";
		try {
			Connection connection=DriverManager.getConnection(jdbcUrl);
//			String sql="INSERT 	into data VALUES (?,?,?,?)";
			
			
			fn=data.get(0);
			ln=data.get(1);
			ei=data.get(2);
			ps=data.get(3);
			
			
			PreparedStatement statement=connection.prepareStatement("INSERT into data VALUES(?,?,?,?)");
			statement.setString(1, fn);
			statement.setString(2, ln);
			statement.setString(3, ei);
			statement.setString(4, ps);
	
		
			int result=statement.executeUpdate();
//			while (result.next()) {
//				String FirstName=result.getString("First Name");
//				String LastName=result.getString("Last Name");
//				String EmailId=result.getString("Email Id");
//				String Password=result.getString("Password");
//				
//				System.out.println(FirstName+" "+ LastName+" "+EmailId+" "+Password);
//			}
			
	} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static boolean verify(String emailid,String password) {
		String  jdbcUrl="jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3390000\\usersdb.db";
			try {
				Connection connection=DriverManager.getConnection(jdbcUrl);
				//String query = "select emailid, password from data where emailid=(?) and password=(?)";
				PreparedStatement ps=connection.prepareStatement("select emailid, password from data where emailid=(?) and password=(?)");
				
				
				ps.setString(1, emailid);
				ps.setString(2,password);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					return true;
				}
				else {
					return false;
				}
				
			} 
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		
	}
//	boolean verify(long LEmailId,long LPassword){
//		String str1 = LogInWindow.LEmailId.getText();
//
//		char[] p = LogInWindow.LPassword.getPassword();
//
//        String str2 = new String(p);
//		String  jdbcUrl="jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3390000\\usersdb.db";
//		try {
//			Connection connection=DriverManager.getConnection(jdbcUrl);
//			PreparedStatement ps=connection.prepareStatement("SELECT * from data where emailid=? and password=?");
//			
//			ps.setLong(1, LEmailId);
//			ps.setLong(2, LPassword);
//			ResultSet rs=ps.executeQuery();
//			if(rs.next())
//				return true;
//			else
//				return false;
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return false;
//		}
//		
//		
//	}
	

}