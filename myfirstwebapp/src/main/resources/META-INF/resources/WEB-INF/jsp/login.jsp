 <html>
    <head>
        <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet" >
        <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.1/jquery.min.js"></script>
    </head>
    <body>
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
    </body>
 </html>