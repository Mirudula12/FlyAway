<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <table class="table table-hover table-striped">
        <thead>
        <tr>
            <th scope="col">Flight</th>
            <th scope="col">Source</th>
            <th scope="col">Destination</th>
            <th scope="col">Ticket Price</th>
            <th scope="col">Select</th>
        </tr>
        </thead>
        <tbody>
        
        <tr bgcolor="#F5F5F5">
            <td>AIR India</td>
            <td>India</td>
            <td>USA</td>
            <td>1,00,000</td>
            <td>
                <form action="carddetails.jsp" method="post">
                    <input type="hidden" id="name" name="name" value="AIR India">
                    <input type="hidden" id="ticket_price" name="ticket_price" value="1,00,000">
                    <input type="submit" class="btn btn-success" value="Pay">
                </form>
            </td>
        </tr>
        
        </tbody>
    </table>

</body>
</html>