<div class="container">
	<div class="page-header">
		<h1>New Area</h1>
	</div>
	
	<form role="form" action="<c:url value="/area/new"/>" method="post">
		<div class="form-group">
			<label for="name">Name</label>
			<input id="name" class="form-control" type="text" name="area.name" placeholder="Enter the area's name  ..." style="width: 300px;" required>
		</div>

		<div class="form-group">
		<label for="description">Description</label>
			<textarea id="description" name="area.description" placeholder="Enter the Description's area ..." class="form-control" rows="3" style="width: 300px;" required></textarea> 
		</div>

		<button type="submit" class="btn btn-default">save</button>
	</form>
	
</div>