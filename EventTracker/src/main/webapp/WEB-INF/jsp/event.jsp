<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
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
				<h1>Welcome to Events</h1>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<div class="row">
			<div class="col-sm-8">
				<s:form action="#" modelAttribute="event" method="get">
				<div class="form-group">
					<h4><label for="name">Working Group:</label></h4>
					<s:input class="form-control" path="name" />
					<s:errors path="name" cssClass="error"/>
				</div>
				<div class="form-group">
					<h4><label for="exercise">Exercise for the day:</label></h4>
					<s:input class="form-control" path="exercise" />
					<s:errors path="exercise" cssClass="error"/>
				</div>
				<div class="form-group">
					<h4><label for="minutes">Workout Session (in Minutes):</label></h4>
					<s:input class="form-control" path="minutes" />
					<s:errors path="minutes" cssClass="error"/>
				</div>
				<div>
					<button type="submit" class="btn btn-default"><h4>Submit your workout</h4></button>
				</div>
				</s:form>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<div class="row">
			<div class="col-sm-8">
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
</body>
</html>