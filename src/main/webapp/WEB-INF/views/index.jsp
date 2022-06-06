<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<!-- css file -->
<link href="/growth_prediction/css/index.css" rel="stylesheet" type="text/css">
<link href="/growth_prediction/css/common.css" rel="stylesheet" type="text/css">
<!-- javascript file -->
<script src="/growth_prediction/js/login.js" type="text/javascript" ></script>
<!-- google gont Noto Sans KR -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">

</head>
<body>
<% //세션이 있으면 메인 화면으로 이동
	String doctor_id = (String)session.getAttribute("doctor_id");
	
	if (doctor_id != null){
		response.sendRedirect("main.jsp");
	}

%>
<div class="contents">
	<div class="main">
		<div class="login_form">
			<h1>BoneAge Prediction</h1>
			<form action="/growth_prediction/login"  method = "post" id = "login" >
				<ul type="none">
				<li><input type="text" name="doctor_id" placeholder="아이디(이메일)" autocomplete="off"  class="login_input" maxlength="20"></li>
				<li><input type="password" name="doctor_pw" placeholder="비밀번호" autocomplete="off" class="login_input" maxlength="20"></li>
				<li><button type="submit" class="login_button" onclick="login_check()">로그인</button></li>
			</form>
				<li>
					<div class="under_login">
						<div class="login_help">
							<a href="/growth_prediction/signup">회원가입</a>
						</div>
						<div class="login_help">
							<a href="/growth_prediction/find_id">아이디 찾기</a>
						</div>
						<div class="login_help">
							<a href="/growth_prediction/find_pw">비밀번호 찾기</a>
						</div>
					</div>
				</li>
				</ul>
		</div>
	</div>
</div>
<footer>
	<div class="footer_text">
		<ul type = "none">
		<li>201721191 최형준</li>
		<li>201721216 윤기웅</li>
		<li>201921195 조우연</li>
		<li>201921211 최아림</li>
		<li>201921199 최윤석</li>
		</ul>
	</div>
</footer>
</body>
</html>

