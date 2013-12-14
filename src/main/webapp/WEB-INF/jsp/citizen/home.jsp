<div class="page-header">
	<h1>Citizens</h1>
</div>
<div class="row">
		<table class="table table-hover">
			<thead>
				<tr>
					<th style="width: 50%">Name</th>
				<th style="width: 50%">Description</th>
			</tr>
		</thead>
		<c:forEach var="citizen" items="${citizens}">
			<tbody>
				<tr>
					<td style="width: 50%">${citizen.name}</td>
					<td style="width: 20%">${citizen.cpf}</td>
					<td style="width: 20%">${citizen.cpf}</td>
					<td style="width: 10%">
						<form role="form" action="<c:url value="/citizen/delete"/>" method="post">
							<button type="submit" class="btn btn-default">X</button>
						</form>
					</td>
				</tr>
			</tbody>
		</c:forEach>
		<c:if test="${fn:length(citizens) <= 0 }">
			<td colspan="3" style="text-align: center;">No Records Found.</td>
		</c:if>
	</table>
</div>
<hr>
<a href="/citizen/new" class="icon-user btn btn-mini btn-success">New Citizen</a>