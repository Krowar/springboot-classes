 <html>
    <head>
        <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet" >
        <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.1/jquery.min.js"></script>
    </head>
    <body>
        <h1>Here we go, let's add a todo'</h1>
		<div class="container">
			<h1>Login</h1>
			<pre>${error}</pre>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        			<form:form method="post" modelAttribute="todo">
        				Description: <form:input type="text" path="description"
        								required="required"/>
        				<form:errors  path="description" cssClass="text-warning"/>
        				<form:input type="hidden" path="id"/>
        				<form:input type="hidden" path="done"/>
        				<input type="submit">
        			</form:form>
    </body>
 </html>