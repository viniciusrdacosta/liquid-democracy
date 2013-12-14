<div style="margin: 50px;">
	<h3>Cadastro</h3>
	
	<form role="form"  action="<c:url value="/register"/>" method="post">
		<div class="form-group">
			<label for="email">Name</label>
			<input id="email" class="form-control" type="text" name="user.name" placeholder="Enter your name ..." style="width: 300px;">
		</div>
		
		<div class="form-group">
			<label for="email">Email</label>
			<input id="email" class="form-control" type="text" name="user.email" placeholder="Enter your email ..." style="width: 300px;">
		</div>


		<div class="form-group">
		<label for="senha">Senha</label>
			<input id="senha"class="form-control" type="password" name="user.password" placeholder="Enter your password ..." style="width: 150px;"> 
		</div>

		<button id="salvar" type="submit" class="btn btn-default">register</button>
	</form>

</div>