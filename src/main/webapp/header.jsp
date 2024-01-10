<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="header-footer">



	<div class="justify-center text-title">Search TShirt Tool</div>

	<%
	if (session.getAttribute("username") != null) {
	%>
	<div class="logout-menu justify-center">
		<div class="row text-1">
			Welcome
			<%=session.getAttribute("username")%>
		</div>
		<div>
			<a class="button logout-button" href="Logout">Logout</a>
		</div>
	</div>
	<%
	}
	%>

</div>
