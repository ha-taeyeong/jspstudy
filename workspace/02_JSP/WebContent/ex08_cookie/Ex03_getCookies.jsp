<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	
	<% 

		// 1. 전체 쿠키를 읽는다.
		Cookie[] cookies = request.getCookies();
		
		// 2. 쿠키를 하나씩 읽는다.
		if (cookies != null && cookies.length != 0) {
			for (Cookie cookie : cookies) {
				out.println("쿠키이름: " + cookie.getName() + "<br>");
				out.println("유효시간: " + cookie.getMaxAge() + "<br>");
				out.println("쿠키값: " + URLDecoder.decode(cookie.getValue(), "utf-8") + "<br>");
			}
		}
		
	%>
	
</body>
</html>