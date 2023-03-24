package com.java.servlet;

import com.login.dao.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L; 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		LoginDao logindao = new LoginDao();
		
		HttpSession session = request.getSession();
		
		try {
			if(logindao.checkLogin(id, pass)) {
				
				session.setAttribute("id", id);
				session.setAttribute("pass", pass);
				
				ResultSet sr = logindao.getData(id, pass);
				
				sr.next();
				
				session.setAttribute("name", sr.getString(4));
				session.setAttribute("furigana", sr.getString(5));
				session.setAttribute("gender", sr.getBoolean(6));
				session.setAttribute("hobby1", sr.getBoolean(7));
				session.setAttribute("hobby2", sr.getBoolean(8));
				session.setAttribute("hobby3", sr.getBoolean(9));
				session.setAttribute("hobby4", sr.getBoolean(10));
				session.setAttribute("hobby5", sr.getBoolean(11));
				session.setAttribute("messenger", sr.getString(12));
				
				response.sendRedirect("toppage.jsp");
				
			} else {
				
//				PrintWriter out = response.getWriter();
//				out.println("ID or Password is incorrect");
				
				
				session.setAttribute("loginfalse", true);
				
				response.sendRedirect("login.jsp");
				
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
