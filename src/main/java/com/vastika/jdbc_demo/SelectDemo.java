package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

import java.sql.SQLException;


public class SelectDemo {
	public static final String SQL = "select * from user_tbl";

	public static void main(String[] args) {
		try(
				Connection con = DBUtil.getConnection();
		Statement st = con.createStatement();
          ){
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				System.out.println("id is : " +rs.getInt("id"));
				System.out.println("user name is :" + rs.getString("user_name"));
				System.out.println("password is: " +rs.getString("password"));
				System.out.println("===================================");
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
}
}
