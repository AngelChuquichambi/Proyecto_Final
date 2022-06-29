<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla de Ventas</title>
        <script src="https://kit.fontawesome.com/f102bd12ee.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <br>
            <h1 class="visually">Registro de Ventas</h1>
            <table class="table table-striped">
                <tr>
                    <th>Identificador</th>
                    <th>Empleado</th>
                    <th>Cliente</th>
                    <th>Automovil</th>
                    <th>Fecha de la Venta</th>

                </tr>
                <c:forEach var="item" items="${tabla}">

                    <tr>
                        <td>${item.id}</td>
                        <td>${item.empleado}</td>
                        <td>${item.cliente}</td>
                        <td>${item.automovil}</td>
                        <td>${item.fecha_venta}</td>
                        <td><a href="controladorVentas?action=editar&id=${item.id}"><i class="fa-regular fa-pen-to-square"></i></a>
                        </td>
                        <td><a href="controladorVentas?action=eliminar&id=${item.id}"><i class="fa-solid fa-trash-can"></i></a>
                        </td>
                    </tr>
                </c:forEach>
                <br>
                <a href="controladorVentas?action=nuevo"class="btn btn-primary btn-sm"> <i class="fa-solid fa-circle-plus"> </i>Registrar Venta</a>
                <br><br>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
