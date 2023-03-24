package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	
	LoginInfo info = new LoginInfo();
	
	String url = info.getUrl();
	String username = info.getUsername();
	String password = info.getPassword();
	
	String sql = "select * from login where id=? and password=?";

	public boolean checkLogin(String id, String pass) throws SQLException {
	
		try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setString(1, id);
            st.setString(2, pass);
            ResultSet sr = st.executeQuery();
            
            if(sr.next()) {
            	return true;
            }
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
		return false;
	}
	
	public ResultSet getData(String id, String pass) throws SQLException {
		
		 try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
	        PreparedStatement st = con.prepareStatement(sql);
	         
	        st.setString(1, id);
	        st.setString(2, pass);
	        ResultSet sr = st.executeQuery();
	        
	        return sr;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
		 return null;
         
	}

}
