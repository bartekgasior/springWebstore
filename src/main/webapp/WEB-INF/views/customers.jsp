<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>Użytkownicy</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="containter">
					<h1> Użytkownicy </h1>
					<p> Wszyscy użytkownicy sklepu </p>
				</div>
			</div>
		</section>
		<section class="container">
			<div class="row">
			<c:forEach items="${customers}" var="customer">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class ="thumbnail">
						<div class = "caption">
							<h3>${customer.name}</h3>
							<p>${customer.customerId}</p>
							<p>Adres użytkownika: ${customer.address}</p>
						</div>
					</div>
				</div>
			</c:forEach>
			</div>
		</section>
	</body>
</html>