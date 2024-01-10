<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>Login</title>
</head>
<body>
	<%
	if (session.getAttribute("username") != null)
		response.sendRedirect("index.jsp");
	%>

	<%@ include file="header.jsp"%>



	<form action="Login" method="post">
		<fieldset class="center-div fieldset">
			<legend class="legend">Login</legend>

			<div class="input-group row">
				<label for="username" class="label"> Username:</label>
				<div>
					<input class="input" type="text" name="username" minlength="5"
						maxlength="50" required />
				</div>
			</div>
			<div class="input-group row">
				<label for="username" class="label" required="required">Password:</label>
				<div class="col-sm-10">
					<input class="input" type="password" name="password" minlength="5"
						maxlength="50" required />
				</div>
			</div>

			<div class="justify-center">
				<input class="button blue-transparent-button" type="submit"
					value="Login" id="login-button" />
			</div>
		</fieldset>

	</form>

	<%@ include file="footer.jsp"%>

</body>
</html>