<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/add-students.css">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">


</head>
<body>

	<div align="center" class="container">
		<h1 class="mb-3">Add Student</h1>

		<form:form action="save-student" modelAttribute="student" method="POST">

			<div class="mb-3">
				<form:hidden path="id" />

				<label class="form-label">Name : </label>
				<form:input class="form-control" path="name" />
				</br>
				
				<label class="form-label">Mobile : </label>
				<form:input class="form-control" path="mobile" />
				</br> 
				
				<label class="form-label">Country : </label>
				<form:input class="form-control" path="country" />
				</br>

			</div>


			<input type="submit" value="Submit" class="btn btn-primary">


		</form:form>
	</div>

</body>
</html>