package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.QueryUtil;

import com.vastika.jdbc_demo.util.DBUtil;


public class UpdateDemo {

		public static void main(String[] args) {
			try (
					Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(QueryUtil.UPDATE_SQL)){
					ps.setString(1, "hari nepal");
					ps.setString(2, "ar");
					ps.setInt(3, 4);
					
					
				ps.executeUpdate();
				System.out.println("Data inserted");
				
			}catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			

		}

	


	}


