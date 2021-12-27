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
    <title>Добавление информации о новом питомце (пациенте)</title>
</head>
<body>
<h2>Добавление информации о новом питомце (пациенте)</h2>
<form:form action="ShowNewPet" modelAttribute="pet">
    <table>
        <tr>
            <td>
                <form:label path="nickname">Кличка</form:label>
            </td>
            <td>
                <form:input path="nickname"></form:input>
                <form:errors path="nickname" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="type_pet">Тип животного</form:label>
            </td>
            <td>
                <form:radiobuttons path="type_pet" items="${pet.type_pets.values()}"></form:radiobuttons>
                <form:errors path="type_pet" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="breed">Порода</form:label>
            </td>
            <td>
                <form:select path="breed">
                    <form:options items="${pet.breeds.values()}"></form:options>
                </form:select>
                <form:errors path="breed" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="sex">Пол животного</form:label>
            </td>
            <td>
                <form:radiobuttons path="sex" items="${pet.sexs.values()}"></form:radiobuttons>
                <form:errors path="sex" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="weight">Вес животного</form:label>
            </td>
            <td>
                <form:input path="weight" type="number" step="0.01" value="0"></form:input> кг
                <form:errors cssStyle="color: red" path="weight"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="age">Возраст животного</form:label>
            </td>
            <td>
                <form:input path="age" type="number" step="0.5" value="0"></form:input> годиков
                <form:errors cssStyle="color: red" path="age"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <button>Ок</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
