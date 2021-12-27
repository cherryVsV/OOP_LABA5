<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tripolskaya-Valeriya
  Date: 15.12.2021
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление информации о новом хозяине питомца</title>
</head>
<body>
    <h2>Добавление информации о новом хозяине питомца</h2>
    <form:form action="ShowNewOwner" modelAttribute="owner">
        <table>
            <tr>
                <td>
                    <form:label path="FIO">ФИО</form:label>
                </td>
                <td>
                    <form:input path="FIO" type="text"></form:input>
                    <form:errors cssStyle="color: red" path="FIO"></form:errors>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="address">Адрес</form:label>
                </td>
                <td>
                    <form:input path="address" type="text"></form:input>
                    <form:errors path="address" cssStyle="color: red"></form:errors>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="numberPhone">Номер телефона</form:label>
                </td>
                <td>
                    <form:input path="numberPhone" type="text"></form:input>
                    <form:errors path="numberPhone" cssStyle="color: red"></form:errors>
                </td>
            </tr>
            <td>
                <form:label path="sex">Пол</form:label>
            </td>
            <td>
                <form:radiobuttons path="sex" items="${owner.sexs.values()}"></form:radiobuttons>
                <form:errors path="sex" cssStyle="color: red"></form:errors>
            </td>
            <tr>
                <td>
                    <button>Ок</button>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
