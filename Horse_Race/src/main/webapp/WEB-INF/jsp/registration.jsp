<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

    <body>
        <div class="header">
            <a href="/home"><div class="item">Главная</div></a>
            <div class="item-center">Регистрация</div>
            <div class="item"></div>
        </div>
        <div class = "center">
            <form action="/registration" method="POST">
                <div class="input-text-wrap"><input type="text" class="input-text" name="login" placeholder="Логин"></div>
                <div class="input-text-wrap"><input type="password" class="input-text" name="password" placeholder="Пароль"></div>
                <div cla    ss="input-text-wrap"><input type="text" class="input-text" name="FULL_NAME" placeholder="Полное имя"></div>
                <div class="input-text-wrap"><input type="number" class="input-text" name="account" placeholder="Счет"></div>
                <div class="input-text-wrap"><input type="text" class="input-text" name="Role" placeholder="Role"></div>
                <c:forEach var="error" items="${errorMsg}">
                    <div>"${error.defaultMessage}"</div>
                </c:forEach>
                <button>Register</button>
            </form>
        </div>
    </body>
</html>