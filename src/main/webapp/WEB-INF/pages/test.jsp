<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
	<form:form method="POST" commandName="wrapper">
		Student Name: <form:input path="student.name" /><br />
		Student Grade: <form:input path="student.grade" /><br />
		Employee Name: <form:input path="employee.name" /><br />
		Employee Salary: <form:input path="employee.salary" /><br />
		<input type="submit" />
	</form:form>
</body>
</html>