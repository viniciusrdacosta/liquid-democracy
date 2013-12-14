<div class="container">
	<div class="page-header">
		<h1>Project</h1>
	</div>

	<div class="row">
		<table class="table table-hover">
			<thead>
				<tr>
					<th style="width: 50%">Name</th>
					<th style="width: 50%">Description</th>
				</tr>
			</thead>
			<c:forEach var="project" items="${projects}">
				<tbody>
					<tr>
						<td style="width: 50%">${project.name}</td>
						<td style="width: 50%">${project.description}</td>
					</tr>
				</tbody>
			</c:forEach>
			<c:if test="${projects.size() <= 0}">
				<td colspan="2" style="text-align: center;">No Records Found.</td>
			</c:if>
		</table>
		<a href="<c:url value="/project/new"/>">New Project</a>
	</div>
</div>
