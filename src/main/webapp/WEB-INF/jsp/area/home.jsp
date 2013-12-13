<div class="container">
	<div class="page-header">
		<h1>Area</h1>
	</div>

	<div class="row">
		<table class="table table-hover">
			<thead>
				<tr>
					<th style="width: 50%">Name</th>
					<th style="width: 50%">Description</th>
				</tr>
			</thead>
			<c:forEach var="area" items="${areas}">
				<tbody>
					<tr>
						<td style="width: 50%">${area.name}</td>
						<td style="width: 50%">${area.description}</td>
						<td>x</td>
					</tr>
				</tbody>
			</c:forEach>
			<c:if test="${areas.size() <= 0}">
				<td colspan="2" style="text-align: center;">No Records Found.</td>
			</c:if>
		</table>
		<a href="<c:url value="/area/new"/>">New Area</a>
	</div>
</div>
