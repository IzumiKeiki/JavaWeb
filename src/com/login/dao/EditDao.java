package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditDao {
	
	LoginInfo info = new LoginInfo();
	
	String url = info.getUrl();
	String username = info.getUsername();
	String password = info.getPassword();
	
	String sql = "update login set name=?, furigana=?, gender=?, hobby1=?, hobby2=?, hobby3=?, hobby4=?, hobby5=?, messenger=? where id=?";
	
	public void setData(String name, String furigana, Boolean gender, Boolean hobby1, Boolean hobby2, Boolean hobby3, Boolean hobby4, Boolean hobby5, String messenger, String id) throws SQLException {
		
		 try {
			Class.forName("org.postgresql.Driver");
			 Connection con = DriverManager.getConnection(url,username,password);
		     PreparedStatement st = con.prepareStatement(sql);
		     
		     st.setString(1, name);
		     st.setString(2, furigana);
		     st.setBoolean(3, gender);
		     st.setBoolean(4, hobby1);
		     st.setBoolean(5, hobby2);
		     st.setBoolean(6, hobby3);
		     st.setBoolean(7, hobby4);
		     st.setBoolean(8, hobby5);
		     st.setString(9, messenger);
		     st.setString(10, id);
		     
		     st.executeQuery();
		     
		     
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    
	}
	
	

}
