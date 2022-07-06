<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheets.css">

</head>
<body>

<div class="container">
       <h1 align="center"> ANAGRACE TECH</h1>



			<form action="/student-management/showAddStudent">

				<input type="submit" value="ADD" class="btn btn-outline-success">

			</form>
			</br>


		<table border="1" class="table">
			<thead class="table-dark">
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

		<div align="center">

			<img alt="fake students photo" src="/student-management/URLToReachImagesFolder/student-image1.png">
		</div>


	</div>


</body>
</html>