<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Welcome Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<h1>Welcome ${user.uname}</h1>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<div class="row">
		<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<h3>
					Quote of the day: ${quote}
				</h3>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<br/>
		<br/>
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<a href="greeting">
					<button type="button" class="btn btn-primary">Click to go Home</button>
				</a>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
</body>
</html>