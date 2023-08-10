
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="create-product" method="post">
            <table>
                <tr>
                    <td>Name Product:</td>
                    <td><input type="text" name="name" value="" /></td>
                </tr>
                <tr>
                    <td>Category_id:</td>
                    <td><select name="category_id">
                            <c:forEach items="${listC}" var="C">
                                <option value="${C.categoryId}">
                                    ${C.categoryName}
                                </option>
                            </c:forEach>
                        </select></td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td><input type="text" name="quantity" value="" /></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" value="" /></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" name="description" value="" /></td>
                </tr>
                <tr>
                    <td>Image:</td>
                    <td><input type="text" name="imagine" value="" /></td>
                </tr>
                <tr>
                    <td>Image2:</td>
                    <td><input type="text" name="imagine2" value="" /></td>
                </tr>
                <tr>
                    <td>Image3:</td>
                    <td><input type="text" name="imagine3" value="" /></td>
                </tr>
                <tr>
                    <td>Created_date</td>
                    <td><input type="date" name="created-date" value="" /></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><input type="radio" name="status" value="0" />Disable
                        <input type="radio" name="status" value="1" />Enable</td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="save"/></td>
                </tr>
            </table>

        </form>
    </body>
</html>