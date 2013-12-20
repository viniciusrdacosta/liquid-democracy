<div class="container">
	<div class="page-header">
		<h1>New Organization</h1>
	</div>
	
	<form role="form" action="<c:url value="/organization/new"/>" method="post">
		<div class="form-group">
			<label for="name">Name</label>
			<input id="name" class="form-control" type="text" name="organization.name" placeholder="Enter the Organization's name  ..." style="width: 300px;" required>
		</div>

		<div class="form-group">
		<label for="description">Description</label>
			<textarea id="description" name="organization.description" placeholder="Enter the Organization's description ..." class="form-control" rows="3" style="width: 300px;" required></textarea> 
		</div>

		<button type="submit" class="btn btn-default">save</button>
	</form>
	
</div>