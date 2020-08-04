package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

public class DeleteDemo {
	public static final String SQL= "delete from user_tbl where id =3";

	public static void main(String[] args) {
		try (
				Connection con = DBUtil.getConnection();
				Statement st = con.createStatement();
				
				){
			st.executeUpdate(SQL);
			System.out.println("Record is deleted");
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
