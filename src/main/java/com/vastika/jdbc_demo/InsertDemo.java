package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

public class InsertDemo {
public static final String SQL = "insert into user_tbl (user_name, password) values ('john', 'a123')";
public static void main (String []args) {
	try(Connection con = DBUtil.getConnection(); 
			Statement st = con.createStatement();){
		st.executeUpdate(SQL);
		System.out.println("Record is inserted into a table");
	}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
