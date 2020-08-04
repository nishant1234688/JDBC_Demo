package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCreateDemo {

	public static void main(String[] args) {
		String sql = "Create database jdbc_demo_db";
	
		Connection con = null;
		Statement st = null;
		
		try {
			//1. Register the driver
			Class.forName("com.mysql.jdbc.Driver");
			//2. Get connection object
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root" , "Nk@9860937528");
			//3. get statement object
			st = con.createStatement();
			//4. execute query
			st.execute(sql);
			System.out.println("Database Created");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {//5.close the connection
				con.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
