<div style="margin: 50px;">
	<h3>Cadastro Cidadão</h3>

	<form role="form" action="<c:url value="/citizen"/>" method="post">
		<div class="form-group">
			<label for="cpf">CPF:</label> <input id="Cpf" class="form-control"
				type="text" name="citizen.cpf" placeholder="CPF"
				style="width: 150px;">
		</div>
		
		<div class="form-group">
			<label for="name">Senha:</label> <input id="name" class="form-control"
				type="text" name="citizen.password" placeholder="Digite sua senha ..."
				style="width: 300px;">
		</div>
	
		<button id="salvar" type="submit" class="btn btn-default">register</button>
	</form>

</div>