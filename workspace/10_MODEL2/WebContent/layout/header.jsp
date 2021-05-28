<%@page import="java.util.Optional"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<%
		request.setCharacterEncoding("utf-8");
		Optional<String> opt = Optional.ofNullable(request.getParameter("title"));
		String title = opt.orElse("환영합니다");
		pageContext.setAttribute("title", title);
	%>
	<title>${title}</title>
	<link rel="stylesheet" href="assets/css/layout.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" referrerpolicy="no-referrer" />
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
	
		<header>
			<a href="#"></a>
				<img src="assets/images/daum.png" alt="로고" style="width: 200px;">
				<nav>
					<ul>
						<li><a href="#">회원가입</a>
						<li><a href="#">로그인</a>
						<li><a href="#">마이페이지</a>
					</ul>
				</nav>
		</header>
		
		<section>