package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	
	LoginInfo info = new LoginInfo();
	
	String url = info.getUrl();
	String username = info.getUsername();
	String password = info.getPassword();
	
	String sql = "insert into login (id, password, name, furigana, gender, hobby1, hobby2, hobby3, hobby4, hobby5, messenger) values (?,?,?,?,?,?,?,?,?,?,?);";
	
	public void setData(String id, String pass, String name, String furigana, Boolean gender, Boolean hobby1, Boolean hobby2, Boolean hobby3, Boolean hobby4, Boolean hobby5, String messenger) throws SQLException {
		
		 try {
			Class.forName("org.postgresql.Driver");
			 Connection con = DriverManager.getConnection(url,username,password);
		     PreparedStatement st = con.prepareStatement(sql);
		     
		     st.setString(1, id);
		     st.setString(2, pass);
		     st.setString(3, name);
		     st.setString(4, furigana);
		     st.setBoolean(5, gender);
		     st.setBoolean(6, hobby1);
		     st.setBoolean(7, hobby2);
		     st.setBoolean(8, hobby3);
		     st.setBoolean(9, hobby4);
		     st.setBoolean(10, hobby5);
		     st.setString(11, messenger);
		     
		     st.executeQuery();
		     
		     
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    
	}

}
