package com.java.servlet;

import java.io.IOException;
import java.sql.SQLException;

import com.login.dao.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String id = (String) session.getAttribute("id");
		
		DeleteDao deletedao = new DeleteDao();
		
		try {
			deletedao.deteleData(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		session.removeAttribute("id");
		session.removeAttribute("pass");
		session.removeAttribute("name");
		session.removeAttribute("furigana");
		session.removeAttribute("gender");
		session.removeAttribute("hobby1");
		session.removeAttribute("hobby2");
		session.removeAttribute("hobby3");
		session.removeAttribute("hobby4");
		session.removeAttribute("hobby5");
		session.removeAttribute("messenger");
		session.invalidate();
		
		response.sendRedirect("login.jsp");
	}

}
