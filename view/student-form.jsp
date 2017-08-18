<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>
	
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
	
	<br><br>
	
	Last Name: <form:input path="lastName"/>
	
	<br><br>
	
	Country:
	
	<form:select path="country">
	
	<form:options items = "${student.countryOptions}" />
	
	</form:select>

	<br><br>
	
	Favourite Language:
	
	Java <form:radiobutton path="favouriteLanguage" value="Java"/>
	ROR <form:radiobutton path="favouriteLanguage" value="ROR"/>
	C# <form:radiobutton path="favouriteLanguage" value="C#"/>
	.NET <form:radiobutton path="favouriteLanguage" value=".NET"/>
	Python <form:radiobutton path="favouriteLanguage" value="Python"/>
	
	
	
	
	<input type="submit" value="Submit"/>	

	</form:form>

</body>

</html>