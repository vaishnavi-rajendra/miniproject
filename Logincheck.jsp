<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="org.json.simple.JSONObject"%>
    
<%
String pName = request.getParameter("uname");
String password = request.getParameter("password");
JSONObject obj=new JSONObject();
String result = "";
	
try{
		Statement st = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miniproject","root","root");
		st = con.createStatement();

ResultSet res = st.executeQuery("select * from register where Username='"+pName+"' and Password='"+password+"'");

if(res.next()){
	String data1 = res.getString(1);
	String data2 = res.getString(2);
	
	if(data1.equals(pName)&& data2.equals(password)){
		result = "y";
			
		}
		
	else{
		result = "n";
	}

	
}

	

out.println("login successfull!!!!");
}
catch(Exception e){
	e.printStackTrace();
}
out.print(result);
out.flush();

%>
