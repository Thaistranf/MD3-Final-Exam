<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 10/10/2023
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>Add new employee</h1>
    <h2>
        <a href="nv-servlet?action=nv-servlet">List All NhanVien</a>
    </h2>
</center>
<form method="post">
    <div>
        <label>Name</label>
        <input type="text" placeholder="Enter name">
    </div>
    <div>
        <label>Email</label>
        <input type="text" placeholder="Enter email">
    </div>
    <div>
        <label>Address</label>
        <input type="text" placeholder="Enter address">
    </div>
    <div>
        <label>PhoneNumber</label>
        <input type="text" placeholder="Enter phone number">
    </div>
    <div>
        <label>Salary</label>
        <input type="text" placeholder="Enter salary">
    </div>
    <div>
        <label>Department</label>
        <input type="text" placeholder="Enter salary">
    </div>
    <div>
        <label for="mymenu">Department</label>
        <select id="mymenu" name="menu">
            <option value="option1">RnD</option>
            <option value="option2">Kinh doanh</option>
            <option value="option3">Dam bao</option>
        </select>
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form>
</body>
</html>
