<div class="container">
	<div class="page-header">
		<h1>Areas</h1>
	</div>


	<table class="">
		<tr>
			<th>NAME</th>
			<th>DESCRIPTION</th>
		</tr>
		<c:forEach var="area" items="${areas}">
			<tr>
				<td>${area.name}</td>
				<td>${area.description}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</div>
</div>