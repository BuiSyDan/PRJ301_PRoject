
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>List Category</h3>
        <a href ="create-category">Create New<a/><br/><br/>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${listCategory}" var="category">
                    <tr>
                        <td>${category.categoryId}</td>
                        <td>${category.categoryName}</td>
                        <td>${category.description}</td>
                        <td><a href ="update-category?id=${category.categoryId}">Update<a/>|<a href ="delete-category?id=${category.categoryId}">Delete<a/> </tr></td>           
                    </tr>      
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>
