<%@page import="java.time.format.FormatStyle"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
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
	<%@ include file="header.jsp"%>

	<div class="justify-center">
		<h1>${mode} Book Details</h1>
	</div>


	<div class="justify-center">
		<form action="saveBook" method="saveBook">

			<%
			if (request.getAttribute("mode").toString().equals("Edit")) {
			%>
			<div class="input-group row">
				<label for="added" class="label"> Added on:</label>
				<div class="input">${book.id}
				<input class="input" type="text" name="id" minlength="5"
						maxlength="50" required hidden="true"/></div>
			</div>
			<%
			} else if (request.getAttribute("mode").toString().equals("Save")) {
			%>
			<div class="input-group row">
				<label for="username" class="label"> Book code:</label>
				<div>
					<input class="input" type="text" name="id" required />
				</div>
			</div>

			<%
			}
			%>



			<div class="input-group row">
				<label for="username" class="label"> Book name:</label>
				<div>
					<input class="input" type="text" name="username" value="${book.name}" required />
				</div>
			</div>
			<div class="input-group row">
				<label for="username" class="label"> Author:</label>
				<div>
					<select class="input" type="" name="username" value="${book.author.id}" required>

						<option>1</option>
					</select>
				</div>
			</div>
			<div class="input-group row">
				<label for="added" class="label"> Added on:</label>
				<div class="input">${date}</div>
				<input class="input" type="text" name="id" value="${book.added} }" required hidden="true"/></div>
			</div>
			
			
			<input type="submit" class="button" value="Submit"></a>
			<a class="button btn-danger" href="Index">Cancel</a>
			
		</form>
	</div>

	

	<%@ include file="footer.jsp"%>

</body>
</html>