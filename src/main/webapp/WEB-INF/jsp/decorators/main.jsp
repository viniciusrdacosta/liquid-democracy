<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		<title><decorator:title default="Liquid Democracy"/></title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/reset.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/main.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/bootstrap-theme.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/font-awesome.min.css"/>
		<decorator:head/>
	</head>
	<body>
		<div>
			<%@ include file="../template/header.jsp" %> 
			<decorator:body/>
			<%@ include file="../template/footer.jsp" %> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/lib/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/lib/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/lib/underscore.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/lib/holder.js"></script>
	</body>
</html>
