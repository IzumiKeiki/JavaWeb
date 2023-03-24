<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="main.css" />
    <title>Main</title>
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
  
    <a href="toppage.jsp"><button>Top page</button></a>
    <h1>一覧</h1>
    <fieldset>
      <legend>ID :</legend>
      <p>${id}</p>
    </fieldset>
    <fieldset>
      <legend>名前 :</legend>
      <p>${name}</p>
    </fieldset>
    <a href="details.jsp"><button>詳細</button></a>
  </body>
</html>
