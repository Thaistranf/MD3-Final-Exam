<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
<center>
    <h1>List NhanVien</h1>
    <h2>
        <a href="/nv-servlet?action=create">Add New NhanVien</a>
    </h2>
</center>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">PhoneNumber</th>
        <th scope="col">Salary</th>
        <th scope="col">Department</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="nv" items="${dsnv}">
        <tr>
            <th><c:out value="${nv.id}"/></th>
            <td><c:out value="${nv.nvName}"/></td>
            <td><c:out value="${nv.email}"/></td>
            <td><c:out value="${nv.address}"/></td>
            <td><c:out value="${nv.phone}"/></td>
            <td><c:out value="${nv.salary}"/></td>
            <td><c:out value="${nv.departmentName}"/></td>
            <td>
                <a href="/nv-servlet?action=edit&id=${user.id}">Edit</a>
                <a href="/nv-servlet?action=delete&id=${user.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>