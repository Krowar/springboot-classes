<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet" >
        <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.1/jquery.min.js"></script>
		<title>List Todos Page</title>
	</head>
	<body>
		<div class="container">
			<h1>Your Todos</h1>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>Author</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th>Delete</th>
						<th>Edit</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.author}</td>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td><a href="delete-todo?todoId=${todo.id}" class="btn btn-warning">Delete todo</a></td>
							<td><a href="update-todo?todoId=${todo.id}" class="btn btn-success">Update todo</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="todo" class="btn btn-success">Add todo</a>

		</div>



	</body>
</html>