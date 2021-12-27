<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Новое животное</title>
</head>
<body>
<h2>Информация о новом животном в ветклинике!</h2>
<br>
<h2>Кличка: ${pet.nickname}</h2>
<br>
<h2>Тип животного: ${pet.type_pet}</h2>
<br>
<h2>Порода: ${pet.breed}</h2>
<br>
<h2>Пол: ${pet.sex}</h2>
<br>
<h2>Вес: ${pet.weight} кг</h2>
<br>
<h2>Возраст: ${pet.age} годиков</h2>
<br>
<form action="/" class="mb_3">
    <button type="submit">Вернуться на главную страницу</button>
</form>
</body>
</html>

