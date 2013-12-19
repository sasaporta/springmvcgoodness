<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	Thank you for submitting the form.<br />
	<br />
	Student Name: <c:out value="${wrapper.student.name}" /><br />
	Student Grade: <c:out value="${wrapper.student.grade}" /><br />
	Employee Name: <c:out value="${wrapper.employee.name}" /><br />
	Employee Salary: <c:out value="${wrapper.employee.salary}" /><br />
	<br />
	<a href=<c:url value="/test" />>Try again</a>
</body>
</html>