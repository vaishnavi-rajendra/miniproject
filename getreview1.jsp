<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="org.json.simple.JSONObject"%>
    
<%
String uName=request.getParameter("user");
JSONObject obj=new JSONObject();
String data = "";

try{
		Statement st = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miniproject","root","root");
		st = con.createStatement();

ResultSet res = st.executeQuery("SELECT * FROM review where uName='"+uName+"'");

if(res.next()){
	 data = res.getString(2);
	
	}

	}
catch(Exception e){
	e.printStackTrace();
}
out.print(data);
out.flush();

%>