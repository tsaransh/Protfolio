package com.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class model {
	public void submit(String name, String email, String subject, String desc) {
		try {
			Class.forName("java.sql.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/websiteinfo","root","Saransh@123");
			Statement stmt = cn.createStatement();
			String Q = "insert into contactinfo values('"+name+"','"+email+"','"+subject+"','"+desc+"');";
			int r = stmt.executeUpdate(Q);
		} catch(Exception e) {
			
		}
	}
}
