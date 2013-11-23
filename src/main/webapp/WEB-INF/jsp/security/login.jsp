<div class="container">
	<c:forEach var="error" items="${errors}">
		<div class="alert alert-danger alert-dismissable">
		  <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
		  <strong>Warning !</strong> ${error.message}
		</div>
	</c:forEach>
	<div class="page-header">
		<h1>Login</h1>
	</div>
	<form role="form"  action="<c:url value="/login"/>" method="post">
		<div class="form-group">
			<label for="email">Email</label>
			<input id="email" class="form-control" type="text" name="user.email" placeholder="Digite seu email ..." style="width: 300px;">
		</div>

		<div class="form-group">
		<label for="senha">Password</label>
			<input id="senha"class="form-control" type="password" name="user.password" placeholder="Senha" style="width: 150px;"> 
		</div>

		<button id="login" type="submit" class="btn btn-default">login</button>
	</form>
	
	<a href="<c:url value="/register"/>">Register</a>
</div>