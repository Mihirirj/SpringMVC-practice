<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Submitted Information</title>
</head>
<body>
    <h2>Submitted Information</h2>
    <table>
        <tr>
            <td>Name</td>
            <td>${myForm.name}</td>
        </tr>
    </table>  
</body>
</html>
