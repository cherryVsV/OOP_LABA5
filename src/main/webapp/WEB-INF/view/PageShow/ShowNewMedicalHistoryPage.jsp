<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Новая медицинская история</title>
</head>
<body>
    <h2>Медицинская история</h2>
    <h2>Животное: ${medical_history.pet}</h2>
    <h2>Симптомы</h2>
    <ul>
        <c:forEach var="symptom" items="${medical_history.symptoms_of_pet}">
            <li>${symptom}</li>
        </c:forEach>
    </ul>
    <h2>Цель посещения ветклиники</h2>
    <ul>
        <c:forEach var="purpose" items="${medical_history.purposeVisit}">
            <li>${purpose}</li>
        </c:forEach>
    </ul>
    <h2>Диагноз: ${medical_history.diagnosis}</h2>
    <h2>Лекарства</h2>
    <ul>
        <c:forEach var="medicine" items="${medical_history.medicines}">
            <li>${medicine}</li>
        </c:forEach>
    </ul>
    <h2>Стоимость лечения (в рублях): ${medical_history.cost} руб.</h2>
    <h2>Рекомендации врача: ${medical_history.recomendations}</h2>
</body>
</html>