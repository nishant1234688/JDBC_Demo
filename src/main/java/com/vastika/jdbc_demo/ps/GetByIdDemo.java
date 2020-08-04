package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

public class GetByIdDemo {

	public static void main(String[] args) {
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.GET_BY_ID_SQL)){
				
			ps.setInt(1,4);
			ResultSet rs =ps.executeQuery();
			if (rs.next()) {
				System.out.println("id is :" + rs.getInt("id"));
				System.out.println("user name is :" + rs.getString("user_name"));
				System.out.println("password is :" + rs.getString("password"));
				System.out.println("=====================");
						
			
		}
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}
}


