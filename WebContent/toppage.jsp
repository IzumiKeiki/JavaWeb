<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="toppage.css" />
    <title>Top page</title>
  </head>
  <body>
  
  <%
  	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
  	response.setHeader("Pragma","no-cache");
  	response.setHeader("Expires","0");
  
  	if(session.getAttribute("id") == null){
  		response.sendRedirect("login.jsp");
  	}
  %>
  
    <h1>Top Page</h1>
    <p>ようこそ、${id}</p>
    <a href="main.jsp"><button>情報確認</button></a>
    <a href="input.jsp"><button>情報入力</button></a>
    
    <form action="logout">
    <a href=""><button>ログアオ</button></a>
 	</form>
    
  </body>
</html>
