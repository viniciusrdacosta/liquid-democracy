<div class="page-header">
	<h1>Citizen</h1>
</div>
<form role="form"  action="<c:url value="/citizen/new"/>" method="post">
	<input id="id" type="hidden" name="citizen.id" value="${citizen.id}">
	<div class="form-group">		
		<label for="name">Name</label>
		<input id="name" class="form-control" type="text" name="citizen.name" style="width: 300px;" value="${citizen.name}"><br>
		<label for="cpf">CPF</label>
		<input id="cpf" class="form-control" type="text" name="citizen.cpf" style="width: 300px;" value="${citizen.cpf}"><br>
		<label for="password">Password</label>
		<input id="password" class="form-control" type="password" name="citizen.password" style="width: 300px;" value="${citizen.password}"><br>
		<label class="checkbox" for="candidate">
			<input id="candidate" type="checkbox" name="citizen.candidate" value="true" <c:if test="${citizen.candidate}">checked</c:if>> Candidate
		</label>
		<hr>
	</div>
	<button id="addCitizen" type="submit" class="btn btn-success">Save</button>
	<c:if test="${not (action eq 'new')}">
		<a href="javascript:del(${citizen.id}, 'citizen', '${citizen.name}(${citizen.cpf})');" class="btn btn-danger">Delete</a>
	</c:if>
	<button type="button" class="btn btn-default" onclick="window.history.back();">Cancel</button>
</form>
