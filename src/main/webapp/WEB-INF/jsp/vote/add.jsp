<div class="container">
	<c:forEach var="error" items="${errors}">
		<div class="alert alert-danger alert-dismissable">
		  <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
		  <strong>Warning !</strong> ${error.message}
		</div>
	</c:forEach>
	<div class="page-header">
		<h1>Delegar Voto</h1>
	</div>
	<form role="form"  action="<c:url value="/vote/new"/>" method="post">
		<div class="form-group">
			<label for="name">Nome</label>
			<input id="name" class="form-control" type="text" name="vote.name" style="width: 300px;">
		</div>
		<button id="addVote" type="submit" class="btn btn-default">Cadastrar</button>
	</form>
	
	<!--  --><a href="<c:url value="/register"/>">Register</a> -->
</div>