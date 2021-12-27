<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Новая запись на приём</title>
</head>
<body>
<%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); %>
<h2>Добавление новой записи на приём</h2>
<form:form action="ShowNewAppointmentToDoctor" modelAttribute="appointment">
    <table>
        <tr>
            <td>
                <form:label path="pet">Выберите животного</form:label>
            </td>
            <td>
                <form:select path="pet" items="${appointment.pets.values()}"></form:select>
                <form:errors path="pet" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="doctor">Выберите доктора</form:label>
            </td>
            <td>
                <form:select path="doctor" items="${appointment.doctors.values()}"></form:select>
                <form:errors path="doctor" cssStyle="color: red"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="dateOfReception">Выберите время приёма</form:label>
            </td>
            <td>
                <form:radiobuttons path="dateOfReception" items="${appointment.datesOfReception.values()}"></form:radiobuttons>
                <form:errors cssStyle="color: red" path="dateOfReception"></form:errors>
            </td>
        </tr>
        <tr>
            <td>
                <form:button>Ок</form:button>
            </td>
        </tr>
    </table>
</form:form>


</body>
</html>
