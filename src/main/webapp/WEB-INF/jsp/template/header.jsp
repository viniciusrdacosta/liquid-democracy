<!-- Navigation Bar -->
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="home">Liquid Democracy</a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li><a href="about">About</a></li>
<<<<<<< HEAD
				<li><a href="area">Areas</a></li>
				<li><a href="projects">Projects</a></li>
				<li><a href="citizens">Citizens</a></li>
=======
				<li><a href="<c:url value="/area"/>">Areas</a></li>
				<li><a href="<c:url value="/project"/>">Projects</a></li>
				<li><a href="candidates">Candidates</a></li>
>>>>>>> 4bf23f7f03ff542499bd71ecf63b5ed00b61432a
				<li><a href="#contact">Contact</a></li>
			</ul>
			<c:choose>
				<c:when test="${userInfo.user != null}">
				
				</c:when>
				<c:otherwise>
					<form role="form" class="form-inline pull-right form-login"  action="<c:url value="/login"/>" method="post">
						<div class="form-group">
							<input type="email" class="form-control" placeholder="Email" name="user.email" required> 
						</div>
						<div class="form-group">
							<input type="password" class="form-control" placeholder="Senha" name="user.password" required>
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-success">Login</button>
						</div>
					</form>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</div>


