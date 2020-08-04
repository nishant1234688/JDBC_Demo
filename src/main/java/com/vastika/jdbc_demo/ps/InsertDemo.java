package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

public class InsertDemo {

	public static void main(String[] args) {
    try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(QueryUtil.INSERT_SQL)){
    	
    } catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	}

}
