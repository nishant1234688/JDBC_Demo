package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;



public class TableCreateDemo {
	public static final String DRIVER_NAME ="com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo_db";
	public static final String USER_NAME= "root";
	public static final String PASSWORD= "Nk@9860937528";
	public static final String SQL= "create table user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(50), primary key (id))";
	
	

	public static void main(String[] args) {
		try (
				Connection con = DBUtil.getConnection();
				Statement st = con.createStatement();
				)
		{
			st.executeUpdate(SQL);
			System.out.println("table created!!!");
			
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
