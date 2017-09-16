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
String uName=request.getParameter("username1");
String review1=request.getParameter("rev");



try
{
	Statement st = null;
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/miniproject","root","root");
	st = con.createStatement();
	ResultSet res = st.executeQuery("select * from review where uName='"+uName+"'");

	if (!res.next()){
		
		
		
	st.executeUpdate("insert into review values('"+uName+"','"+review1+"')");
	out.println("Review stored successfull!!!!");
	}
	else{
		String data2 = res.getString(2);
		data2=data2+"-"+review1;
		

st.executeUpdate("UPDATE review SET rName='"+data2+"' where uName='"+uName+"'");
out.println("Review stored successfull!!!!");


	}
}
catch(Exception e){
	e.printStackTrace();
}

%>

</body>
</html>