<%-- 
    Document   : frmclientes
    Created on : 28 jun. de 2022, 15:16:30
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Cliente</title>
        <script src="https://kit.fontawesome.com/f102bd12ee.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <br>
            <h1 class="visually">Registrar Cliente</h1>
            <form action="controladorClientes" method="post">

                <div class="form-group">
                    <label for="c" class="form-label">CI</label>
                    <input type="text" class="form-control" id="c" required name="ci" value="${cliente.ci}"> 
                </div>
                <div class="form-group">
                    <label for="no" class="form-label">Nombres</label>
                    <input type="text" class="form-control" id="no" required name="nombres" value="${cliente.nombres}">  
                </div>
                <div class="form-group">
                    <label for="ape"class="form-label">Apellidos</label>
                    <input type="text" class="form-control" id="ape" name="apellidos" value="${cliente.apellidos}">  
                </div>
                <div class="form-group">
                    <label for="tel"class="form-label">Teléfono</label>
                    <input type="text" class="form-control" id="tel" required name="telefono" value="${cliente.telefono}">
                </div>
                <div class="form-group">
                    <label for="fec"class="form-label">Fecha de Nacimiento</label>
                    <input type="text" class="form-control" id="fec" required name="fecha_nac" value="${cliente.fecha_nac}">
                </div>
                <div class="form-group">
                    <label for="di"class="form-label">Dirección</label>
                    <input type="text" class="form-control" id="di" required name="direccion" value="${cliente.direccion}">
                </div>
                <br>
                <input type="submit" class="btn btn-primary" value="Registrar">

            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
