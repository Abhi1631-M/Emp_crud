<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Employee</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-4">
    <h1 class="mb-4">Add Employee</h1>
    <form:form action="/emp-detail/add" method="post" modelAttribute="employeeManage">
        <div class="form-group">
            <label for="firstName">First Name</label>
            <form:input path="firstName" id="firstName" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="lastName">Last Name</label>
            <form:input path="lastName" id="lastName" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="jobRole">Job Role</label>
            <form:input path="jobRole" id="jobRole" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="salary">Salary</label>
            <form:input path="salary" id="salary" class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">Add Employee</button>
    </form:form>
</div>
</body>
</html>
