        <%@ include file="common/header.jspf" %>
    <body>
    <%@ include file="common/navigation.jspf" %>
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

        <%@ include file="common/footer.jspf" %>
	</body>
</html>