<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
    <title>Start Page</title>

</head>
<body>
<h1>Сайт ветеринарной клиники на Spring MVC</h1>
<form action="/Specialists/AddNewSpecialist" class="mb_3">
    <button type="submit">Добавить информацию о новом специалисте </button>
</form>
<form action="/Pets/AddNewPet" class="mb_3">
    <button type="submit">Добавить информацию о новом питомце (пациенте)</button>
</form>
<form action="/Owners/AddNewOwner" class="mb_3">
    <button type="submit">Добавить информацию о хозяине питомца</button>
</form>
<form action="/Medical_history/AddNewMedicalHistory" class="mb_3">
    <button type="submit">Добавить информацию о медицинской истории пациента</button>
</form>
<form action="/Owner_Pet/AddNewOwnerPet" class="mb_3">
    <button type="submit">Добавить связь между питомцем и его владельцем</button>
</form>
<form action="/DoctorAppointment/AddNewAppointmentToDoctor" class="mb_3">
    <button type="submit">Запись на приём</button>
</form>
</body>
</html>