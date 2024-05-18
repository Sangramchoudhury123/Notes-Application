<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<div class="container-fluid p-0 m-0">
<%@ include file="component-folder/allcss.jsp"%>

<%@ include file="component-folder/navbar.jsp" %>
		
	</div>
	<br>
	<div class="container">
		<h2>Please fill note details</h2>
	    <%= (String)session.getAttribute("success")%>
		<form action="addnotes" method="post">
			<div class="form-group">
				<label for="title">Note title</label>
				<input type="text" class="form-control" id="title" name="title"
					aria-describedby="emailHelp" placeholder="Enter title" required >
			</div>
			<div class="form-group">
				<label for="description">Note description</label> 
				<textarea name="description" id="content" required placeholder="Enter your description here"
				class="form-control"
				style="height:300px"></textarea>
			</div>
			
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Save your note</button>
			</div>
			
		</form>
	</div>
	<br>
	<br>

</body>
</html>