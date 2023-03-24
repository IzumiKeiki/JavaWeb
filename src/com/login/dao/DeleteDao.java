package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDao {
	
	LoginInfo info = new LoginInfo();
	
	String url = info.getUrl();
	String username = info.getUsername();
	String password = info.getPassword();
	
	String sql = "delete from login where id=?";

	public void deteleData(String id) throws SQLException {
		
		 try {
			Class.forName("org.postgresql.Driver");
			 Connection con = DriverManager.getConnection(url,username,password);
		     PreparedStatement st = con.prepareStatement(sql);
		     
		     st.setString(1, id);
		     
		     st.executeQuery();
		     
		     
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    
	}

}

