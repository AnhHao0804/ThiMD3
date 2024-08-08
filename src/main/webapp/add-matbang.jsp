<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/8/2024
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Mat Bang - TH Cinema</title>
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
                <a class="nav-link" href="add-matbang.jsp">Add Mat Bang <span class="sr-only">(current)</span></a>
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
    <h1>Add New Mat Bang</h1>
    <form action="add-matbang" method="post">
        <div class="form-group">
            <label for="maMatBang">Mã Mặt Bằng</label>
            <input type="text" class="form-control" id="maMatBang" name="maMatBang" required>
        </div>
        <div class="form-group">
            <label for="maToaNha">Mã Tòa Nhà</label>
            <input type="text" class="form-control" id="maToaNha" name="maToaNha" required>
        </div>
        <div class="form-group">
            <label for="soMatBang">Số Mặt Bằng</label>
            <input type="number" class="form-control" id="soMatBang" name="soMatBang" required>
        </div>
        <div class="form-group">
            <label for="dienTich">Diện Tích</label>
            <input type="number" step="0.01" class="form-control" id="dienTich" name="dienTich" required>
        </div>
        <div class="form-group">
            <label for="loaiMatBang">Loại Mặt Bằng</label>
            <select class="form-control" id="loaiMatBang" name="loaiMatBang" required>
                <option value="Văn phòng">Văn phòng</option>
                <option value="Cửa hàng">Cửa hàng</option>
            </select>
        </div>
        <div class="form-group">
            <label for="giaThue">Giá Thuê</label>
            <input type="number" step="0.01" class="form-control" id="giaThue" name="giaThue" required>
        </div>
        <div class="form-group">
            <label for="trangThai">Trạng Thái</label>
            <select class="form-control" id="trangThai" name="trangThai" required>
                <option value="Đang cho thuê">Đang cho thuê</option>
                <option value="Đang trống">Đang trống</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Add Mat Bang</button>
    </form>
</div>
</body>
</html>

