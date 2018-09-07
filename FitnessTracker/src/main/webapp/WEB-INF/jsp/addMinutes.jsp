<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Add Minutes</title>
	<style type="text/css">
		.myStyle {
			font-size: 24px;
		}
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
				<h1><spring:message code="goal.h1"/></h1>
				<div class="myStyle">
					Language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
				</div>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<div class="row">
			<div class="col-sm-8">
				<s:form action="#" modelAttribute="exercise">
				<div class="form-group">
					<h4><label for="uname"><spring:message code="goal.uname"/></label></h4>
					<s:input class="form-control" path="exercise" />
					<s:errors path="exercise" cssClass="error"/>
				</div>
				<div class="form-group">
					<h4><label for="email"><spring:message code="goal.email"/></label></h4>
					<s:input class="form-control" path="minutes" />
					<s:errors path="minutes" cssClass="error"/>
				</div>
				<div>
					<button type="submit" class="btn btn-default"><h4><spring:message code="goal.submit"/></h4></button>
				</div>
				</s:form>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<div class="row">
			<div class="col-sm-8">
				<h1>Your goal for the day is: ${goal.minutes}</h1>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
</body>
</html>