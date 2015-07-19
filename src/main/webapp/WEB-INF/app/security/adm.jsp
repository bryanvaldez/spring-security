<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <body>
        <h1>Bienvenido Administrador</h1>
        <h2>${mensaje}</h2>
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <h3><a href="<%=request.getContextPath()
                   %>/logout">Cerrar sesión</a></h3>
            </c:if>
    </body>
</html>