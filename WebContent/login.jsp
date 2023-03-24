<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="login.css" />
    <title>Login page</title>
  </head>
  <body>
    <h1>LoginPage</h1>
    <h2>ログイン</h2>
    <div class="red">${loginfalse ? "ID or Password is incorrect" : "" }</div>
    <form action="login" method="post">
    <div class="form-group">
      <label class="main-label" for="id">ID :</label>
      <input type="text" id="id" name="id" required />
    </div>
    <div class="form-group">
      <label class="main-label" for="pass">パスワード :</label>
      <input type="password" id="pass" name="pass" required />
    </div>
    <a href=""><button>ログイン</button></a>
 	</form>

    <hr />

    <h2>登録</h2>
    <form action="register" method="post">
    <div class="form-group">
      <label class="main-label" for="id">ID :</label>
      <input type="text" id="id" name="id" required />
    </div>
    <div class="form-group">
      <label class="main-label" for="pass">パスワード :</label>
      <input type="password" id="pass" name="pass" required />
    </div>
    <div class="form-group">
      <label class="main-label" for="name">名前 :</label>
      <input type="text" id="name" name="name" required />
    </div>
    <div class="form-group">
      <label class="main-label" for="furigana">ふりがな :</label>
      <input type="text" id="furigana" name="furigana" required />
    </div>
    <div class="form-group">
      <label class="main-label">性別 :</label>
      <label for="male">男性</label>
      <input type="radio" id="male" value="male" name="gender" required />
      <label for="female">女性</label>
      <input type="radio" id="female" value="female" name="gender" required />
    </div>
    <div class="form-group">
      <label class="main-label">趣味 :</label>
      <label for="reading">読書</label>
      <input type="checkbox" id="reading" value="true" name="hobby1" />
      <label for="cooking">料理</label>
      <input type="checkbox" id="cooking" value="true" name="hobby2" />
      <label for="travel">旅行</label>
      <input type="checkbox" id="travel" value="true" name="hobby3" />
      <label for="painting">描き</label>
      <input type="checkbox" id="painting" value="true" name="hobby4" />
      <label for="movie">映画</label>
      <input type="checkbox" id="movie" value="true" name="hobby5" />
    </div>
    <div class="form-group">
      <label class="main-label" for="messenger">一言 :</label>
      <textarea id="messenger" name="messenger"></textarea>
    </div>
    <a href=""><button>登録</button></a>
    </form>
  </body>
  
  <%
    session.removeAttribute("loginfalse");
  %>
</html>
