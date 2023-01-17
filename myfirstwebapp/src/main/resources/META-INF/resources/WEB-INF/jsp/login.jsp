        <%@ include file="common/header.jspf" %>
    <body>
    <%@ include file="common/navigation.jspf" %>
        <h1>Please enter the login</h1>
		<div class="container">
			<h1>Login</h1>
			<pre>${error}</pre>
			<form method="post">
				Name: <input type="text" name="name">
				Password: <input type="password" name="password">
				<input type="submit">
			</form>
		</div>
		        <%@ include file="common/footer.jspf" %>
    </body>
 </html>