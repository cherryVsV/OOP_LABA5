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
    <title>Добавление новой медицинской истории</title>
</head>
<body>
    <h2>Добавление новой медицинской истории</h2>
    <form:form action="ShowNewMedicalHistory" modelAttribute="medical_history">
        <table>
            <tr>
                <td>
                    <form:label path="pet">Выберите животное</form:label>
                </td>
                <td>
                    <form:select path="pet" items="${medical_history.pets.values()}"></form:select>
                    <form:errors path="pet" cssStyle="color: red"></form:errors>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="purposeVisit">Цель визита</form:label>
                </td>
                <td>
                    <form:checkboxes path="purposeVisit" items="${medical_history.all_purpose_visit.values()}"></form:checkboxes>
                    <form:errors path="purposeVisit" cssStyle="color: red"></form:errors>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="symptoms_of_pet">Симптомы</form:label>
                </td>
                <td>
                    <form:checkboxes path="symptoms_of_pet" items="${medical_history.all_symptoms.values()}"></form:checkboxes>
                    <form:errors path="symptoms_of_pet" cssStyle="color: red"></form:errors>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="diagnosis">Диагноз</form:label>
                </td>
                <td>
                    <form:select path="diagnosis" items="${medical_history.all_diagnosis.values()}"></form:select>
                    <form:errors path="diagnosis"></form:errors>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="medicines">Лекарства</form:label>
                </td>
                <td>
                    <form:checkboxes path="medicines" items="${medical_history.all_medicines.values()}"></form:checkboxes>
                    <form:errors path="medicines" cssStyle="color: red"></form:errors>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="cost">Стоимость лечения (в рублях)</form:label>
                </td>
                <td>
                    <form:input path="cost" type="number" value="0"></form:input>
                    <form:errors path="cost" cssStyle="color: red"></form:errors>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="recomendations">Рекомендации врача</form:label>
                </td>
                <td>
                    <form:input path="recomendations" type="text"></form:input>
                    <form:errors path="recomendations" cssStyle="color: red"></form:errors>
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
