<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://kit.fontawesome.com/f102bd12ee.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

    </head>
    <body>
        <div class="container">
        <br>
        <h1 style="text-align: center">Color de Autos</h1>
        <br>
            <a href="controladorColor?action=nuevo" class="btn btn-primary btn-sm"> <i class="fa-solid fa-circle-plus"> </i> NUEVO COLOR</a>
            <br><br>
            <table class="table table-striped">
                <tr>
                    <th>ID</th>
                    <th>Descripcion</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach var="item" items="${tabla}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.descripcion}</td>
                        <td><a href="controladorColor?action=editar&id=${item.id}"><i class="fa-regular fa-pen-to-square"></i></a></td>
                        <td><a href="controladorColor?action=eliminar&id=${item.id}" onclick="return(confirm('Esta seguro????'))">
                                <i class="fa-solid fa-trash-can"></i>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
