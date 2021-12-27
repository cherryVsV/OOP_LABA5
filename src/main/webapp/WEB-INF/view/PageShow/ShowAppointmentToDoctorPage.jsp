<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Новая запись на приём</title>
</head>
<body>
<h2>Запись на приём</h2>
<br>
<h2>Животное: ${appointment.pet}</h2>
<br>
<h2>Доктор: ${appointment.doctor}</h2>
<br>
<h2>Время приёма: ${appointment.dateOfReception}</h2>
<form action="/" class="mb_3">
    <button type="submit">Вернуться на главную страницу</button>
</form>
</body>
</html>

