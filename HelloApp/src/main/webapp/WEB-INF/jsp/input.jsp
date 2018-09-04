<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Input Page</title>
<style type="text/css">
	.error {
		color: #ff0000;
		font-style: italic;
		font-size: 150%;
	}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-8">
				<h1>Input View</h1>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<div class="row">
			<div class="col-sm-8">
				<s:form action="welcome" modelAttribute="user">
				<div class="form-group">
					<h4><label for="uname">User Name:</label></h4>
					<s:input class="form-control" path="uname" />
					<s:errors path="uname" cssClass="error"/>
				</div>
				<div class="form-group">
					<h4><label for="email">Email address:</label></h4>
					<s:input class="form-control" path="email" />
					<s:errors path="email" cssClass="error"/>
				</div>
				<div>
					<button type="submit" class="btn btn-default"><h4>Submit</h4></button>
				</div>
				</s:form>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
</body>
</html>