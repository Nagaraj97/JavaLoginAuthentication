<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%
     response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");

     if(session.getAttribute("uname")==null)
     {
     	response.sendRedirect("Login.jsp");
     }
     %>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/Sr8O025mhis?si=E-7CK6y12GozbpHt" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
	<form action="Logout">
      <input type="submit" value="Logout">
    </form>

</body>
</html>