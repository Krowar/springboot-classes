        <%@ include file="common/header.jspf" %>
    <body>
    <%@ include file="common/navigation.jspf" %>
        <h1>Here we go, let's add a todo'</h1>
		<div class="container">
			<h1>Login</h1>
			<pre>${error}</pre>

        			<form:form method="post" modelAttribute="todo">
        			    <fieldset>
                            <form:label path="description">Description:</form:label>
                            <form:input type="text" path="description" required="required"/>
                            <form:errors  path="description" cssClass="text-warning"/>
        				</fieldset>
                        <fieldset>
                            <form:label path="targetDate">Targer Date:</form:label>
                            <form:input type="text" path="targetDate" required="required"/>
                            <form:errors  path="targetDate" cssClass="text-warning"/>
                        </fieldset>
        				<form:input type="hidden" path="id"/>
        				<form:input type="hidden" path="done"/>
        				<input type="submit">
        			</form:form>
        <%@ include file="common/footer.jspf" %>
    </body>
    <script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd'
    });
    </script>
 </html>

