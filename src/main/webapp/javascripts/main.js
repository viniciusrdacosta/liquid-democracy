function edit(id){
	window.location = window.location +"/edit/"+ id;
}

function del(id, entity, value)
{
	if(confirm('Do you really want to delete '+ entity +':\n'+ value +'?'))
	{
		if(window.location.href.indexOf("/edit/") >= 0)
			document.formDelete.action = window.location.href.replace("/edit/", "/delete/");
		else
			document.formDelete.action = window.location +"/delete/"+ id;
		
		document.formDelete.submit();
	}
}