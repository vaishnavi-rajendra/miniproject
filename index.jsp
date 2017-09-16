<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>

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
