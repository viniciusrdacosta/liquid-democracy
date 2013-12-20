<div class="page-header">
	<h1>Citizens</h1>
</div>

	<table class="table table-hover">
		<thead>
			<tr>
			<th style="width: 50%">Name</th>
			<th style="width: 20%">CPF</th>
			<th style="width: 20%">Candidate?</th>
			<th style="width: 10%"></th>
		</tr>
	</thead>
	<c:forEach var="citizen" items="${citizens}">
		<tbody>
			<tr style="cursor: pointer; cursor: hand;">
				<td style="width: 50%" ><a href="<c:url value="/citizen/edit/${citizen.id}"/>">${citizen.name}</a></td>
				<td style="width: 20%" onclick="edit(${citizen.id})">${citizen.cpf}</td>
				<td style="width: 20%" onclick="edit(${citizen.id})">${citizen.candidate}</td>
				<td style="width: 10%">
					<a href="javascript:del(${citizen.id}, 'citizen', '${citizen.name}(${citizen.cpf})');" class="btn btn-danger btn-xs">Delete</a>
				</td>
			</tr>
		</tbody>
	</c:forEach>
	<c:if test="${fn:length(citizens) <= 0 }">
		<td colspan="3" style="text-align: center;">No Records Found.</td>
	</c:if>
</table>
<a href="<c:url value="/citizen/new"/>" class="icon-user btn btn-success">New Citizen</a>