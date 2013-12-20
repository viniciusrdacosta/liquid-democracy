<div class="container">
	<div class="page-header">
		<h1>New Project</h1>
	</div>
	
	<form role="form"  action="<c:url value="/project/new"/>" method="post">
		<div class="form-group">
			<label for="code">Code</label>
			<input id="code" class="form-control" type="text" name="project.code" placeholder="Enter the project's code  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="name">Name</label>
			<input id="name" class="form-control" type="text" name="project.name" placeholder="Enter the project's name  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="author">Author</label>
			<input id="author" class="form-control" type="text" name="candidate.author" placeholder="Enter the project's author  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="addate">Add Date</label>
			<input id="addate" class="form-control" type="text" name="project.addate" placeholder="Enter the project's addate  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="description">Description</label>
			<input id="description" class="form-control" type="text" name="project.description" placeholder="Enter the project's description  ..." style="width: 300px;" required>
		</div>
		
			
		<div class="form-group">
			<label for="endate">End Date</label>
			<input id="endate" class="form-control" type="text" name="project.endate" placeholder="Enter the project's endate  ..." style="width: 300px;" required>
		</div>
		
		
		<div class="form-group">
			<label for="area">Area</label>
			<input id="area" class="form-control" type="text" name="project.area" placeholder="Enter the project's area  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="created">Created</label>
			<input id="created" class="form-control" type="text" name="project.created" placeholder="Enter the project's created  ..." style="width: 300px;" required>
		</div>
		
		
		<div class="form-group">
			<label for="finaldate">Final Date</label>
			<input id="finaldate" class="form-control" type="text" name="project.finaldate" placeholder="Enter the project's created  ..." style="width: 300px;" required>
		</div>
		
		
		<div class="form-group">
			<label for="identification">Identification</label>
			<input id="identification" class="form-control" type="text" name="project.identification" placeholder="Enter the project's created  ..." style="width: 300px;" required>
		</div>
		
		<div class="form-group">
			<label for="initialdate">Initial Date</label>
			<input id="initialdate" class="form-control" type="text" name="project.initialdate" placeholder="Enter the project's created  ..." style="width: 300px;" required>
		</div>
		
		
		
	
		

		<button id="salvar" type="submit" class="btn btn-default" >save</button>
	</form>
	
</div>