<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		
		<title>Login</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="containter">
					<h1> Login </h1>
					<p> Podaj dane</p>
				</div>
			</div>
		</section>
		<section class="container">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class ="panel panel-default">
						<div class = "panel-heading">
							<div class = "panel-title">Zaloguj się</div>
						</div>
						<div class="panel-body">
							<c:if test="${not empty error}">
								<div class="alert alert-danger">
									<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
								</div>
							</c:if>
							<form action="<c:url value="/j_spring_security_check"></c:url>" method="POST">
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
								<fieldset>
									<div class="form-group">
										<input class="form-control" id="username" placeholder="Username" name="username" type="text" required>
									</div>
									<div class="form-group">
										<input class="form-control" id="password" placeholder="Password" name="password" type="password" value="" required>
									</div>
									<input class="btn btn-lg btn-success btn-block" type="submit" value="Zaloguj się">
								</fieldset>
							</form>							
						</div>
					</div>
				</div>
			</div>
		</section>
	</body>
</html>