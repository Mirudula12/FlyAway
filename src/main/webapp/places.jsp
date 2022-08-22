<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to my display page</title>
</head>
<body>
<%
try
{
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase","root","Mirdula@1567");
        String sql = "select * from Flight";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()==false)
        {
            out.println("No Records in the table");
        }
        else
        {%>
       
        <table border="1">
        <tr><th>Name</th><th>Source</th><th>Destination</th><th>Ticketprice</th></tr>
        <%
            do
            {%>
           
            <tr><td><%= rs.getString(1)%></td><td><%= rs.getString(2)%></td><td><%= rs.getString(3)%></td><td><%= rs.getInt(4)%></td></tr>
           
            <%}while(rs.next());
        }
       
}
catch(Exception e)
{
    out.println(e.getMessage());
    e.getStackTrace();
}
%>
</table>
</body>
</html>