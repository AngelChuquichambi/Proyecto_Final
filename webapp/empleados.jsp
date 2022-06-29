<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla Empleados</title>
        <script src="https://kit.fontawesome.com/f102bd12ee.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <br>
            <h1 class="visually">Empleados de la Empresa</h1>
            <table class="table table-striped">
                <tr>
                    <th>Cedula Identidad</th>
                    <th>Cargo</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Teléfono</th>
                    <th>Dirección</th>

                </tr>
                <c:forEach var="item" items="${tabla}">

                    <tr>
                        <td>${item.ci}</td>
                        <td>${item.cargo}</td>
                        <td>${item.nombre}</td>
                        <td>${item.apellidos}</td>
                        <td>${item.fecha_nac}</td>
                        <td>${item.telefono}</td>
                        <td>${item.direccion}</td>
                        <td><a href="controladorEmpleados?action=editar&ci=${item.ci}"><i class="fa-regular fa-pen-to-square"></i></a>
                        </td>
                        <td><a href="controladorEmpleados?action=eliminar&ci=${item.ci}"><i class="fa-solid fa-trash-can"></i></a>
                        </td>
                    </tr>
                </c:forEach>
                <br>
                <a href="controladorEmpleados?action=nuevo"class="btn btn-primary btn-sm"> <i class="fa-solid fa-circle-plus"> </i> Insertar Empleado Nuevo</a>
                <br><br>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

            </table>
        </div>
    </body>
</html>
