<nav class="navbar navbar-fixed-top navbar-inverse" role="navigation">
	<div class="container">
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav">
				<li><a href="#about">About</a></li>
				<li><a href="#services">Services</a></li>
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
</nav>