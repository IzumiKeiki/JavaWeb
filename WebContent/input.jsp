<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="input.css" />
    <title>Input</title>
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
  　<a href="detais.jsp"><button>詳細</button></a>
    <h1>入力</h1>
    <form action="edit">
    <div class="form-group">
      <label class="main-label" for="name">名前 :</label>
      <input type="text" id="name" name="name" value="${name}" />
    </div>
    <div class="form-group">
      <label class="main-label" for="furigana">ふりがな :</label>
      <input type="text" id="furigana" name="furigana" value="${furigana}" />
    </div>
    <div class="form-group">
      <label class="main-label">性別 :</label>
      <label for="male">男性</label>
      <input type="radio" id="male" value="male" name="gender" ${gender ? "checked": ""} />
      <label for="female">女性</label>
      <input type="radio" id="female" value="female" name="gender" ${gender ? "": "checked"} />
    </div>
    <div class="form-group">
      <label class="main-label">趣味 :</label>
      <label for="reading">読書</label>
      <input
        type="checkbox"
        id="reading"
        value="true"
        name="hobby1"
        ${hobby1 ? "checked": ""}
      />
      <label for="cooking">料理</label>
      <input type="checkbox" id="cooking" value="true" name="hobby2" ${hobby2 ? "checked": ""} />
      <label for="travel">旅行</label>
      <input type="checkbox" id="travel" value="true" name="hobby3" ${hobby3 ? "checked": ""}/>
      <label for="painting">描き</label>
      <input type="checkbox" id="painting" value="true" name="hobby4" ${hobby4 ? "checked": ""}/>
      <label for="movie">映画</label>
      <input type="checkbox" id="movie" value="true" name="hobby5" ${hobby5 ? "checked": ""}/>
    </div>
    <div class="form-group">
      <label class="main-label" for="messenger">一言 :</label>
      <textarea id="messenger" name="messenger" placeholder="from database">${messenger}</textarea>
    </div>
    <button>編集</button>
	</form>
	
  </body>
</html>
