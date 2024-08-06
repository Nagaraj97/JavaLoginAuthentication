<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
   button {
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background-color: #0056b3;
        }
  

</style>
</head>
<body>
    <%  
    
    
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");

        if(session.getAttribute("uname")==null)
        {
        	response.sendRedirect("Login.jsp");
        }
    
    %>
    <h1>Welcome to our website</h1>
    ${uname}
    <a href="Video.jsp">Videos</a>
    
    <form action="Logout">
      <button type="submit">Logout</button>
    </form>
</body>
</html>