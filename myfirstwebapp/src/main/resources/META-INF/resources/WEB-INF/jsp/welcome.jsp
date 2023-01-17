<%@ include file="common/header.jspf" %>
    <body>
    <%@ include file="common/navigation.jspf" %>
        <h1>Welcome to the todo site</h1>
		<div class="container">
			<h1>Welcome ${name}</h1>
			<a href="list-todos">Manage</a> your todos
		</div>
        <%@ include file="common/footer.jspf" %>
    </body>
 </html>