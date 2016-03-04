<%@page import="com.egen.eros.useractions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page language="java" " import="com.egen.eros.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="com.egen.eros.useractions">
<input type="text" name="id" >
<input type=submit name="DeleteUser"  >
<input type="text" name="idofuser" >
<input type=submit name="Display user for id"  >

</form>>
<div id="content">
		<%User us=(User) request.getAttribute("user");%>
		<form name="myform" action=""><table border='0' ALIGN='center' font size='10'>
                 						
                 						 <tr  align="center"><td> ID :</td><td><%=us.getId()%></td></tr>
                 						 <tr  align="center"><td>First Name:</td><td><%=us.getFname()%></td></tr>
                 						 <tr  align="center"><td>Last Name:</td><td><%=us.getLname()%></td></tr>
                 						 <tr  align="center"><td>Email:</td><td><%=us.getEmail()%></td></tr>
                 						 <tr  align="center"><td>Age :</td><td><%=us.getAge()%></td></tr>
                 						 <tr  align="center"><td>Movielist :</td><td><%=us.getMovieList()%></td></tr>
    </table></form>
		
			
</div>
</body>
</html>