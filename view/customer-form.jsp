<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Customer Registration Form</title>

<style>
	.error {color.red}
</style>
</head>
<body>

	Fill out the form. Asterick (*) means required.

	<br>
	<br>

	<form:form action="processForm" modelAttribute="customer">

First name   : <form:input path="firstName" />

		<br>
		<br>

Last name(*) : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />

		<br>
		<br>

Free Passes	 : <form:input path="freePasses"/>
				<form:errors path="freePasses" cssClass="error" />		
		<input type="submit" value="Submit" />

	</form:form>

</body>


</html>