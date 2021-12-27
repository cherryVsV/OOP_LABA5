<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Информация о новом враче</title>
</head>
<body>
    <h2>Информация о новом враче</h2>
    <br>
    <h2>ФИО: ${specialist.FIO}</h2>
    <br>
    <h2>Должность: ${specialist.post}</h2>
    <br>
    <h2>Номер телефона: ${specialist.numberPhone}</h2>
    <br>
    <h2>Кабинет приёма: ${specialist.numberCabinet}</h2>
    <br>
    <h2>Опыт работы (в годах): ${specialist.workExperience}</h2>
    <br>
    <h2>Дежурные дни</h2>
    <ul>
        <c:forEach var="dutyDay" items="${specialist.dutyDays}">
            <li>${dutyDay}</li>
        </c:forEach>
    </ul>
    <br>
    <form action="/" class="mb_3">
        <button type="submit">Вернуться на главную страницу</button>
    </form>
</body>
</html>