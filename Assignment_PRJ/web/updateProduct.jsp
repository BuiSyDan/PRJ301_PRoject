

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="update-product" method="post">
            <table>
                <input type="hidden" name="id" value="${product.id}" />
                <tr>
                    <td>Name Product:</td>
                    <td><input type="text" name="name" value="${product.name}" /></td>
                </tr>
                <tr>
                    <td>Category_name:</td>
                    <td>
                        <select name="category_id">
                            <c:forEach items="${listC}" var="C">
                                <option ${C.categoryId == product.category_id?"selected":""} value="${C.categoryId}">
                                    ${C.categoryName}
                                </option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td><input type="text" name="quantity" value="${product.quantity}" /></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" value="${product.price}" /></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><input type="text" name="description" value="${product.description}" /></td>
                </tr>
                <tr>
                    <td>Image:</td>
                    <td><input type="text" name="imagine" value="${product.imagine}" /></td>
                </tr>
                <tr>
                    <td>Image2:</td>
                    <td><input type="text" name="imagine2" value="${product.imagine2}" /></td>
                </tr>
                <tr>
                    <td>Image3:</td>
                    <td><input type="text" name="imagine3" value="${product.imagine3}" /></td>
                </tr>
                <tr>
                    <td>Created_date:</td>
                    <td><input type="date" name="created_date" value="${product.created_date}" /></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <c:if test="${product.status == true}">
                    <td><input type="radio" name="status" value="0" />Disable
                        <input type="radio" name="status" checked value="1" />Enable</td>
                    </c:if>
                    <c:if test="${product.status == false}">
                    <td><input type="radio" name="status" checked value="0" />Disable
                    <input type="radio" name="status" value="1" />Enable</td>
                    </c:if>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="save"/></td>
                </tr>
            </table>

        </form>
    </body>
</html>