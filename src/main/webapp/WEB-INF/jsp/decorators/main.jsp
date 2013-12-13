<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
		<![endif]-->
		
		<title><decorator:title default="Liquid Democracy"/></title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/reset.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/main.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/bootstrap-theme.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/font-awesome.min.css"/>
		<decorator:head/>
	</head>
	<body>
		<%@ include file="../template/header.jsp" %> 
		<c:if test="${errors.size() > 0}">
			<div class="alert alert-danger alert-dismissable">
		  		<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
				<c:forEach var="error" items="${errors}">
			  		<strong>Error !</strong> ${error.message}
				</c:forEach>
			</div>
		</c:if>
			<decorator:body/>
		<%@ include file="../template/footer.jsp" %>
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/main.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/lib/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/lib/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/lib/underscore.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/lib/holder.js"></script>
	</body>
</html>


