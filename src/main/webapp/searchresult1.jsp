<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h2 {text-align: center;}
p {text-align: center;}
</style>
</head>
<body>
<h2>Available Flight</h2>
<p>Showing available flights from Australia to Canada</p>
 <table class="table table-hover table-striped">
        <thead>
        <tr>
            <th scope="col">Flight</th>
            <th scope="col">Ticket Price</th>
            <th scope="col">Select</th>
        </tr>
        </thead>
        <tbody>
        
        <tr bgcolor="#F5F5F5">
            <td>Air Canada</td>
            <td>70000</td>
            <td>
                <form action="personaldetails.html">
                    <input type="submit" value="Book this Flight">
                </form>
            </td>
        </tr>
        
        </tbody>
    </table>

</body>
</html>