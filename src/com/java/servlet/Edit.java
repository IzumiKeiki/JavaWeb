package com.java.servlet;

import com.login.dao.*;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String furigana = request.getParameter("furigana");
		
		Boolean gender;
		if(request.getParameter("gender").equals("male")) {
			gender = true;
		} else {
			gender = false;
		}
		
		Boolean hobby1;
		if(request.getParameterMap().containsKey("hobby1")) {
			hobby1 = true;
		} else {
			hobby1 = false;
		}
		
		Boolean hobby2;
		if(request.getParameterMap().containsKey("hobby2")) {
			hobby2 = true;
		} else {
			hobby2 = false;
		}
		
		Boolean hobby3;
		if(request.getParameterMap().containsKey("hobby3")) {
			hobby3 = true;
		} else {
			hobby3 = false;
		}
		
		Boolean hobby4;
		if(request.getParameterMap().containsKey("hobby4")) {
			hobby4 = true;
		} else {
			hobby4 = false;
		}
		
		Boolean hobby5;
		if(request.getParameterMap().containsKey("hobby5")) {
			hobby5 = true;
		} else {
			hobby5 = false;
		}
		
		String messenger = request.getParameter("messenger");
		
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		EditDao editdao = new EditDao();
		
		try {
			editdao.setData(name, furigana, gender, hobby1, hobby2, hobby3, hobby4, hobby5, messenger, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		session.setAttribute("name", name);
		session.setAttribute("furigana", furigana);
		session.setAttribute("gender", gender);
		session.setAttribute("hobby1", hobby1);
		session.setAttribute("hobby2", hobby2);
		session.setAttribute("hobby3", hobby3);
		session.setAttribute("hobby4", hobby4);
		session.setAttribute("hobby5", hobby5);
		session.setAttribute("messenger", messenger);
		
		response.sendRedirect("details.jsp");
	}

}
