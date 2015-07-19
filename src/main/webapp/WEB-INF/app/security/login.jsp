<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Spring-Security Login</title>
    </head>
    <body>
        <h3>Spring Security Login</h3>
        <form method="post" name="f" action="<%=request.getContextPath()%>/j_spring_security_check">
            <table>
                <c:if test="${loginError}">
                    <tr><td colspan="2" style="color: red">Usuario / Clave
                            incorrectos.</td></tr>
                        </c:if>
                <tr><td>Usuario:</td><td><input type="text" name="j_username" value=""/></td></tr>
                <tr><td>Clave:</td><td><input type="password" name="j_password" value=""/></td></tr>
                <tr><td><input type="submit" value="Ingresar"/></td></tr>
            </table>
        </form>
    </body>
</html>