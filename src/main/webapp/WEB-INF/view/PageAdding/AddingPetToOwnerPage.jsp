<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Связывание хозяина и питомца</h2>
<form:form action="ShowNewOwnerOfPet" modelAttribute="owner_pet">
    <table>
        <tr>
            <td>
                <form:label path="pet">Выберите питомца</form:label>
            </td>
            <td>
                <form:select path="pet" items="${owner_pet.pets.values()}"></form:select>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="owner">Выберите владельца</form:label>
            </td>
            <td>
                <form:select path="owner" items="${owner_pet.owners.values()}"></form:select>
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