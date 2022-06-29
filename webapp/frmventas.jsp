
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Ventas</title>
        <script src="https://kit.fontawesome.com/f102bd12ee.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <br>
            <h1 class="visually">Registro de Ventas</h1>
            <form action="controladorVentas" method="post">

                <label for="id">Id</label>
                <input type="hidden" name="id" value="${venta.id}">

                <div class="form-group">
                    <label for="em" class="form-label">Empleado</label>
                    <input type="text" class="form-control" id="em" name="empleado" required value="${venta.empleado}">
                </div>
                <div class="form-group">
                    <label for="cli" class="form-label">Cliente</label>
                    <input type="text" class="form-control" id="cli" name="cliente" required value="${venta.cliente}">
                </div>
                <div class="form-group">
                    <label for="au" class="form-label">Automovil</label>
                    <input type="text" class="form-control" id="au" name="automovil" required value="${venta.automovil}">
                </div>
                <div class="form-group">
                    <label for="fec" class="form-label">Fecha de Venta</label>
                    <input type="text" class="form-control" id="fec" name="fecha_venta" required value="${venta.fecha_venta}">
                </div>
                <br>
                <input type="submit" class="btn btn-primary" value="Registrar">
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
