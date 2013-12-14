<div class="container">
	<div class="page-header">
		<h1>New Project</h1>
	</div>
	
	<form role="form"  action="<c:url value="/project/new"/>" method="post">
		<div class="form-group">
			<label for="code">Code</label>
			<input id="code" class="form-control" type="text" name="code" placeholder="Enter the project's code  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="name">Name</label>
			<input id="name" class="form-control" type="text" name="project.name" placeholder="Enter the project's name  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="author">Author</label>
			<input id="author" class="form-control" type="text" name="project.author" placeholder="Enter the project's author  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="description">Description</label>
			<input id="description" class="form-control" type="text" name="project.description" placeholder="Enter the project's description  ..." style="width: 300px;" required>
		</div>
		
		
		<div class="form-group">
			<label for="addate">Date</label>
			<input id="addate" class="form-control" type="text" name="project.addate" placeholder="Enter the project's addate  ..." style="width: 300px;" required>
		</div>
		
		
		<div class="form-group">
			<label for="endate">endate</label>
			<input id="endate" class="form-control" type="text" name="project.endate" placeholder="Enter the project's endate  ..." style="width: 300px;" required>
		</div>
		

		<button type="submit" class="btn btn-default">save</button>
	</form>
	
</div>