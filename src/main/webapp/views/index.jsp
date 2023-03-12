<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4><font color="green">Student Saved Successfully...</font> </h4>
	<h3>Student Registration Form</h3>
	<form:form action="save" modelAttribute="student">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<form:radiobutton path="gender" value="Male"/>Male
					<form:radiobutton path="gender" value="Female"/>Female
				</td>
			</tr>
			<tr>
				<td>Course:</td>
				<td>
					<form:select path="course">
						<form:option value="">--Select--</form:option>
						<form:options items="${couses}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Timings: </td>
				<td>
					<form:checkboxes items="${timings}" path="timings"/>
				</td>
			</tr>
			
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Save"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>