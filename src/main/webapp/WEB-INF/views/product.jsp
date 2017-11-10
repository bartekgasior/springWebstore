<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>Produkt</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="containter">
					<h1> Produkt </h1>
				</div>
			</div>
		</section>
		<section class="container">
			<div class="row">
				<div class="col-sm-5">
					<div class ="thumbnail">
						<div class = "caption">
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p>
								<strong>Producent</strong>: ${product.manufacturer}
							</p>
							<p>
								<strong>Kategoria</strong>: ${product.category}
							</p>
							<p>
								<strong>Dostępna liczba sztuk</strong>: ${product.unitsInStock}
							</p>
							<h4>${product.unitPrice} PLN</h4>
							<p>
								<a href="<spring:url value="/products" />" class="btn btndefault">
									<span class="glyphicon-hand-left glyphicon"></span>
									Wstecz
								</a>
								<a href= "#" class="btn btn=warning btn-large">
									<span class="glyphicon-shopping-cart glyphicon"></span>
									Zamów teraz	
								</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</section>
	</body>
</html>