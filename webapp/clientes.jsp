<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla Clientes</title>
        <script src="https://kit.fontawesome.com/f102bd12ee.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body class="text-center">
        <div class="container">
            <main class="form-signin w-100 m-auto" >
                <br>
                <h1 class="visually">Clientes Afiliados a la Empresa</h1>
                <table class="table table-striped">
                    <tr>
                        <th>Cedula Identidad</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Teléfono</th>
                        <th>Fecha de Nacimiento</th>
                        <th>Dirección</th>

                    </tr>
                    <c:forEach var="item" items="${tabla}">

                        <tr>
                            <td>${item.ci}</td>
                            <td>${item.nombres}</td>
                            <td>${item.apellidos}</td>
                            <td>${item.telefono}</td>
                            <td>${item.fecha_nac}</td>
                            <td>${item.direccion}</td>
                            <td><a href="controladorClientes?action=editar&ci=${item.ci}"><i class="fa-regular fa-pen-to-square"></i></a>
                            </td>
                            <td><a href="controladorClientes?action=eliminar&ci=${item.ci}"><i class="fa-solid fa-trash-can"></i></a>
                            </td>
                        </tr>
                    </c:forEach>
                    <br>
                    <a href="controladorClientes?action=nuevo"class="btn btn-primary btn-sm"> <i class="fa-solid fa-circle-plus"> </i>Insertar Cliente</a>
                    <br><br>
                </table>
            </main>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
