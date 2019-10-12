<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

    <body>
        <div class="header">
        </div>
        <div class = "center">
            <form action="add" method="POST">
                <div class="input-text-wrap"><input type="number" class="input-text" name="id" placeholder="ИД забега"></div>
                <div class="input-text-wrap"><input type="text" class="input-text" name="date" placeholder="Дата забега"></div>

                </div>
                <c:forEach var="error" items="${errorMsg}">
                    <div>"${error.defaultMessage}"</div>
                </c:forEach>
                <div>"${excMsg}"</div>
                <button>Добавить</button>
            </form>
        </div>
        <div class="footer">
            <div class="item"></div>
            <div class="item-center">Система скачек</div>
            <div class="item"></div>
        </div>
    </body>
</html>