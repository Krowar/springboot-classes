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
			<form method="post">
				Description: <input type="text" name="description" required="required">
				Target date: <input type="text" name="targetDate">
				<input type="submit">
			</form>
		</div>
    </body>
 </html>