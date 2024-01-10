<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.ByteArrayInputStream"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/style.css">

<%
if (session.getAttribute("username") == null)
	response.sendRedirect("login.jsp");
%>
<meta charset="UTF-8">
<meta http-equiv='cache-control' content='no-cache'>

<title>Library</title>
</head>
<body>
    <%@ include file = "header.jsp" %>


	<div class="justify-center">	
		<h1>Books Listing</h1>
		<div class="right-button-container">
			<a href="New" class="filled-button"> Add a book</a>
		</div>
	</div>
	<<div class="justify-center">
		<table class="table" cellpadding="10">
		<tr>
			<th>Book Code</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Date Added</th>
			<th colspan="2">Actions</th>
		</tr>
		</table>
	</div>


	






	<%@ include file="footer.jsp"%>

</body>
</html>