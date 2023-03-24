<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="details.css" />
    <title>Details</title>
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
  　<a href="main.jsp"><button>一覧</button></a>
    <h1>詳細</h1>
    <fieldset>
      <legend>名前 :</legend>
      <p>${name}</p>
    </fieldset>
    <fieldset>
      <legend>ふりがな :</legend>
      <p>${furigana}</p>
    </fieldset>
    <fieldset>
      <legend>性別 :</legend>
      <p>${gender ? "male": "female"}</p>
    </fieldset>
    <fieldset>
      <legend>趣味 :</legend>
      <p><span>${hobby1 ? "読書 ": ""}</span><span>${hobby2 ? "料理 ": ""}</span><span>${hobby3 ? "旅行 ": ""}</span><span>${hobby4 ? "描き ": ""}</span><span>${hobby5 ? "映画 ": ""}</span></p>
    </fieldset>
    <fieldset>
      <legend>一言 :</legend>
      <p>${messenger}</p>
    </fieldset>
    <a href="input.jsp"><button>編集</button></a>
    <form action="delete">
      <a href=""><button>削除</button></a>
    </form>
  </body>
</html>
