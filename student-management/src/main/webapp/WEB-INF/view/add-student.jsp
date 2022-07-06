<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/add-student.css">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">

</head>
<body>

	<div align="center">
		<h1>Add Student</h1>

		<form:form action="save-student" modelAttribute="student" method="POST">

			<form:hidden path="id"/>
			
			<label>Name : </label>
			<form:input path="name" />
			</br>

			<label>Mobile : </label>
			<form:input path="mobile" />
			</br>

			<label>Country : </label>
			<form:input path="country" />
			</br>

			<input type="submit" value="Submit">


		</form:form>
	</div>

</body>
</html>