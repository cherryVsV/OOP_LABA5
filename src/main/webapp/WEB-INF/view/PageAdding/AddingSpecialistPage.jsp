<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tripolskaya-Valeriya
  Date: 15.12.2021
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление информации о новом ветеринаре</title>
</head>
<body>
    <h2>Добавление информации о новом ветеринаре</h2>
    <form:form action="ShowNewSpecialist" modelAttribute="specialist">
    <table>
        <tr>
            <td>
                <form:label path="FIO">ФИО</form:label>
            </td>
            <td>
                <form:input path="FIO"></form:input>
                <form:errors path="FIO" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="post">Должность</form:label>
            </td>
            <td>
               <form:select path="post">
                   <form:options items="${specialist.posts.values()}"></form:options>
               </form:select>
                <form:errors path="post" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="numberPhone">Номер телефона</form:label>
            </td>
            <td>
                <form:input path="numberPhone"></form:input>
                <form:errors cssStyle="color: red" path="numberPhone"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="numberCabinet">Кабинет приёма</form:label>
            </td>
            <td>
                <form:radiobuttons path="numberCabinet" items="${specialist.numbersOfCabinets.values()}"></form:radiobuttons>
                <form:errors path="numberCabinet" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="workExperience">Опыт работы (в годах)</form:label>
            </td>
            <td>
                <form:input path="workExperience" type="number" value="0"></form:input>
                <form:errors cssStyle="color: red" path="workExperience"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="dutyDays">Дежурные дни</form:label>
            </td>
            <td>
                <form:label path="dutyDays">Пн</form:label>
                <form:checkbox path="dutyDays" value="Пн"></form:checkbox>
                <br>
                <form:label path="dutyDays">Вт</form:label>
                <form:checkbox path="dutyDays" value="Вт"></form:checkbox>
                <br>
                <form:label path="dutyDays">Ср</form:label>
                <form:checkbox path="dutyDays" value="Ср"></form:checkbox>
                <br>
                <form:label path="dutyDays">Чт</form:label>
                <form:checkbox path="dutyDays" value="Чт"></form:checkbox>
                <br>
                <form:label path="dutyDays">Пт</form:label>
                <form:checkbox path="dutyDays" value="Пт"></form:checkbox>
                <br>
                <form:label path="dutyDays">Сб</form:label>
                <form:checkbox path="dutyDays" value="Сб"></form:checkbox>
                <br>
                <form:label path="dutyDays">Вс</form:label>
                <form:checkbox path="dutyDays" value="Вс"></form:checkbox>
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
