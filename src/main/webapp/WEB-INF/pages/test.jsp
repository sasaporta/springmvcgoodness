<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
	<form:form method="POST" commandName="wrapper" enctype="multipart/form-data">
		Student Name: <form:input path="student.name" /><br />
		Student Grade: <form:input path="student.grade" /><br />
		Employee Name: <form:input path="employee.name" /><br />
		Employee Salary: <form:input path="employee.salary" /><br />
		<br />
		File: <input type="file" name="myfile"/><br/>
		<br />
		<input type="submit" />
	</form:form>
</body>
</html>