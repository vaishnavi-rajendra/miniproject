<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String pName=request.getParameter("username");
String password=request.getParameter("password");
String email=request.getParameter("mail");
String country=request.getParameter("country");

try
{
	Statement st = null;
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miniproject","root","root");
	st = con.createStatement();
	st.executeUpdate("insert into register values('"+pName+"','"+password+"','"+email+"','"+country+"')");
	out.println("Registation successfull!!!!");
}
catch(Exception e){
	e.printStackTrace();
}

%>

</body>
</html>