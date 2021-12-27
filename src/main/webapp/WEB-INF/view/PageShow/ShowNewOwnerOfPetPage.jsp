<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Владелец животного</title>
</head>
<body>
<h2>Новый хозяин питомца</h2>
<br>
<h2>Хозяин: ${owner_pet.owner}</h2>
<br>
<h2>Питомец: ${owner_pet.pet}</h2>
<br>
<form action="/" class="mb_3">
    <button type="submit">Вернуться на главную страницу</button>
</form>
</body>
</html>