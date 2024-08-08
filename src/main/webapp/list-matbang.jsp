<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/8/2024
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List Mat Bang</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/js/all.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">
        <i class="fas fa-home"></i> Home
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="add-matbang.jsp">Add Mat Bang</a>
            </li>
        </ul>
        <ul class="navbar-nav">
            <c:choose>
                <c:when test="${sessionScope.username != null}">
                    <li class="nav-item">
                        <a class="nav-link" href="logout">
                            <i class="fas fa-sign-out-alt"></i> Logout
                        </a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li class="nav-item">
                        <a class="nav-link" href="login.jsp">
                            <i class="fas fa-sign-in-alt"></i> Login
                        </a>
                    </li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>

<div class="container mt-5">
    <h1>List of Mat Bang</h1>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Mã Mặt Bằng</th>
            <th>Mã Tòa Nhà</th>
            <th>Số Mặt Bằng</th>
            <th>Diện Tích</th>
            <th>Loại Mặt Bằng</th>
            <th>Giá Thuê</th>
            <th>Trạng Thái</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="matBang" items="${matBangList}">
            <tr>
                <td><c:out value="${matBang.maMatBang}"/></td>
                <td><c:out value="${matBang.maToaNha}"/></td>
                <td><c:out value="${matBang.soMatBang}"/></td>
                <td><c:out value="${matBang.dienTich}"/></td>
                <td><c:out value="${matBang.loaiMatBang}"/></td>
                <td><c:out value="${matBang.giaThue}"/></td>
                <td><c:out value="${matBang.trangThai}"/></td>
                <td>
                    <a href="${pageContext.request.contextPath}/matbangs?action=delete&maMatBang=${matBang.maMatBang}" class="btn btn-danger btn-sm">Xóa</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

