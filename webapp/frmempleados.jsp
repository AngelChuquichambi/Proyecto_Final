
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Empleados</title>
        <script src="https://kit.fontawesome.com/f102bd12ee.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <br>
            <h1 class="container">Registro de Empleados</h1>
            <form action="controladorEmpleados" method="post">

                <div class="form-group">
                    <label for="c" class="form-label">CI</label>
                    <input type="number" class="form-control" min="0" name="ci" id="c" required value="${empleado.ci}">
                </div>
                <div class="form-group">
                    <label for="ca" class="form-label">Cargo</label>
                    <input type="text" class="form-control" id="ca" name="cargo" required value="${empleado.cargo}">
                </div>
                <div class="form-group">
                    <label for="no" class="form-label">Nombres</label>
                    <input type="text" class="form-control" id="no" name="nombre" required value="${empleado.nombre}">
                </div>
                <div class="form-group">
                    <label for="ap" class="form-label">Apellidos</label>
                    <input type="text" class="form-control" id="ap" name="apellidos" required value="${empleado.apellidos}">
                </div>
                <div class="form-group">
                    <label for="fe" class="form-label">Fecha Nacimiento</label>
                    <input type="text" class="form-control" id="fe" name="fecha_nac" required value="${empleado.fecha_nac}">
                </div>
                <div class="form-group">
                    <label for="te" class="form-label">Teléfono</label>
                    <input type="number" class="form-control" min="0" name="telefono" id="te" required value="${empleado.telefono}">
                </div>
                <div class="form-group">
                    <label for="di" class="form-label">Dirección</label>
                    <input type="text" class="form-control" id="di" name="direccion" required value="${empleado.direccion}">
                </div>
                <br>
                <input type="submit" class="btn btn-primary" value="Registrar">
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
