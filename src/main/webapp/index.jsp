<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
if (session.getAttribute("currentUser") == null) {
	response.sendRedirect("login.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management System</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<h1
		style="background-color: lightblue; text-align: center; padding: 10px;">LIBRARY
		& KNOWLEDGE RESOURCE CENTRE 📖</h1>

		<nav class="navbar navbar-expand-lg bg-body-tertiary">
			<div class="container-fluid">
				<a class="navbar-brand" href="index.jsp">Books</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="addBook.jsp">Add Book</a></li>
						<li class="nav-item"><a class="nav-link" href="issueBook.jsp">Issue Book</a></li>
						
					</ul>
					<form class="d-flex" action="logout.jsp" method="post">
						<button class="btn btn-outline-success" type="submit">LogOut</button>
					</form>
				</div>
			</div>
		</nav>
	
	<div id="carouselExampleAutoplaying" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="image\thought-catalog-B1dQCWz0U2w-unsplash.jpg"
					class="d-block w-100" style="height: 450px;" alt="">
			</div>
			<div class="carousel-item">
				<img src="image\marvin-cheung-VcNMXUH15FI-unsplash.jpg"
					class="d-block w-100" style="height: 450px;" alt="">
			</div>
			<div class="carousel-item">
				<img src="image\thought-catalog-V5BGaJ0VaLU-unsplash.jpg"
					class="d-block w-100" style="height: 450px;" alt="">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<div style="display: flex; gap: 25px; padding: 20px;">
		<div class="card" style="width: 18rem;">
			<img src="image\zoshua-colah-Kp_-rgu1bgw-unsplash.jpg"
				class="card-img-top" alt="...">
		</div>
		<div class="card" style="width: 18rem;">
			<img src="image\surja-sen-das-raj-JIWPWcUnhUs-unsplash.jpg"
				class="card-img-top" alt="...">
		</div>
		<div class="card" style="width: 18rem;">
			<img src="image\milad-fakurian-zWiqrmlK_KE-unsplash.jpg"
				class="card-img-top" alt="...">
		</div>

		<div class="card" style="width: 18rem;">
			<img src="image\fauzan-ardhi-e-5DieY8snc-unsplash.jpg"
				class="card-img-top" alt="...">
		</div>
	</div>
	<div style="display: flex; gap: 25px; padding: 20px;">
		<div class="card" style="width: 18rem;">
			<img src="image\trust-tru-katsande-Z0Drh_f3D1M-unsplash.jpg"
				class="card-img-top" alt="...">
		</div>

		<div class="card" style="width: 18rem;">
			<img src="image\kelly-sikkema-hoLcM3v_tTs-unsplash.jpg"
				class="card-img-top" alt="...">
		</div>
		<div class="card" style="width: 18rem;">
			<img src="image\thought-catalog-V5BGaJ0VaLU-unsplash.jpg"
				class="card-img-top" alt="...">
		</div>
		<div class="card" style="width: 18rem;">
			<img src="image\marvin-cheung-VcNMXUH15FI-unsplash.jpg"
				class="card-img-top" alt="...">
		</div>
	</div>


	<h2 style="text-align: center; margin-top: 20px;">New Arrivals</h2>


	<!-- Carousel Container -->
	<div id="bookCarousel" class="carousel slide" data-bs-ride="carousel"
		style="width: 80%; margin: auto;">
		<div class="carousel-inner">

			<!-- First slide - active -->
			<div class="carousel-item active">
				<img src="image/marvin-cheung-VcNMXUH15FI-unsplash.jpg"
					class="d-block w-100" alt="Book 1">
				<div class="carousel-caption d-none d-md-block">
					<h5>Fundamentals Of Agriculture Vol - I</h5>
				</div>
			</div>

			<!-- Second slide -->
			<div class="carousel-item">
				<img src="image/thought-catalog-V5BGaJ0VaLU-unsplash.jpg"
					class="d-block w-100" alt="Book 2">
				<div class="carousel-caption d-none d-md-block">
					<h5>Fungi And Plant Diseases</h5>
				</div>
			</div>

			<!-- Third slide -->
			<div class="carousel-item">
				<img src="image/kelly-sikkema-hoLcM3v_tTs-unsplash.jpg"
					class="d-block w-100" alt="Book 3">
				<div class="carousel-caption d-none d-md-block">
					<h5>Fundamentals Of Agronomy</h5>
				</div>
			</div>

			<div class="carousel-item">
				<img src="image/trust-tru-katsande-Z0Drh_f3D1M-unsplash.jpg"
					class="d-block w-100" alt="Book 3">
				<div class="carousel-caption d-none d-md-block">
					<h5>Fundamentals Of Agronomy</h5>
				</div>
			</div>

			<div class="carousel-item">
				<img src="image/kelly-sikkema-hoLcM3v_tTs-unsplash.jpg"
					class="d-block w-100" alt="Book 3">
				<div class="carousel-caption d-none d-md-block">
					<h5>Fundamentals Of Agronomy</h5>
				</div>
			</div>

			<div class="carousel-item">
				<img src="image/thought-catalog-B1dQCWz0U2w-unsplash.jpg"
					class="d-block w-100" alt="Book 3">
				<div class="carousel-caption d-none d-md-block">
					<h5>Fundamentals Of Agronomy</h5>
				</div>
			</div>

		</div>

		<!-- Controls -->
		<button class="carousel-control-prev" type="button"
			data-bs-target="#bookCarousel" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#bookCarousel" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span>
		</button>
	</div>

	<hr>

	<h3 style="margin:30px;">Ask Librarian <br>
	Jigyasha Chauhan</h3>
	<p style="margin:30px;">Moradabad Uttar Pradesh 244501 <br>
	Email:-jigyashachauhan555@gmail.com</p>

	<hr>

	<h3
		style="background-color: lightblue; text-align: center; padding: 10px;">
		© 2024, Teerthanker Mahaveer University | Customized by: Team Central
		Library</h3>
	<!-- Bootstrap JS Bundle -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>