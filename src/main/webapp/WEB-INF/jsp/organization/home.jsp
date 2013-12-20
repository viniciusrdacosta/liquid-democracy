<div class="container">
	<div class="page-header">
		<h1>Organization</h1>
	</div>

	<div class="row">
		<table class="table table-hover">
			<thead>
				<tr>
					<th style="width: 50%">Name</th>
					<th style="width: 50%">Description</th>
				</tr>
			</thead>
			<c:forEach var="organization" items="${organizations}">
				<tbody>
					<tr>
						<td style="width: 50%">${organization.name}</td>
						<td style="width: 50%">${organization.description}</td>
						<td>
							<form role="form" action="<c:url value="/organization/delete/${organization}"/>" method="post">			
								<a href="javascript:del(${organization.id}, 'organization', '${organization.name}(${organization.id})');" class="btn btn-danger">Delete</a>
							</form>
						</td>
					</tr>
				</tbody>
			</c:forEach>
			<c:if test="${fn:length(organizations) <= 0 }">
				<td colspan="2" style="text-align: center;">No Records Found.</td>
			</c:if>
		</table>
		<a href="<c:url value="/organization/new"/>">New Organization</a>
	</div>
</div>
