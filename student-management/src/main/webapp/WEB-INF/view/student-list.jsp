<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">

</head>
<body>

<h1 align="center"> SELENIUM EXPRESS</h1>

	<div align="center">
		<form action="/student-management/showAddStudent">

			<input type="submit" value="ADD">

		</form>

		<table border="1">
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
				</tr>
			</thead>


			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td> <a href="/student-management/updateStudent?userId=${student.id}">Update</a></td>
					<td> <a href="/student-management/deleteStudent?userId=${student.id}" onClick="if(!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		
		<img alt="fake students photo" src="/student-management/URLToReachResourcesFolder/images/student-image1.png">
		
	</div>


</body>
</html>