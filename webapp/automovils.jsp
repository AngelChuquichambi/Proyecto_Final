<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- CSS only -->
        <script src="https://kit.fontawesome.com/f102bd12ee.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body background="">

        <!--Estilos--->
        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }

            .b-example-divider {
                height: 3rem;
                background-color: rgba(0, 0, 0, .1);
                border: solid rgba(0, 0, 0, .15);
                border-width: 1px 0;
                box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
            }

            .b-example-vr {
                flex-shrink: 0;
                width: 1.5rem;
                height: 100vh;
            }

            .bi {
                vertical-align: -.125em;
                fill: currentColor;
            }

            .nav-scroller {
                position: relative;
                z-index: 2;
                height: 2.75rem;
                overflow-y: hidden;
            }

            .nav-scroller .nav {
                display: flex;
                flex-wrap: nowrap;
                padding-bottom: 1rem;
                margin-top: -1px;
                overflow-x: auto;
                text-align: center;
                white-space: nowrap;
                -webkit-overflow-scrolling: touch;
            }

            .contacto{
                text-align: center;
            }

            .map-responsive{
                overflow:hidden;
                padding-bottom:56.25%;
                position:relative;
                height:0;
            }

            .map-responsive iframe{
                left:0;
                top:0;
                height:100%;
                width:100%;
                position:absolute;
            }

            .body{
                background-image: url("https://www.xtrafondos.com/wallpapers/resized/porsche-911-guntherwerks-front-top-9597.jpg?s=large");
            }

        </style>

        <h1 class="visually-hidden">VENTA DE AUTOMOVILES</h1>

        <div class="container">
            <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
                <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
                    <img class="bi me-2" width="40" height="32" src="https://www.purosautos.com/wp-content/uploads/2018/05/2017-Chevrolet-Camaro-Compare.png"/>
                    <span class="fs-4">VENTA DE AUTOMOVILES</span>
                </a>

                <ul class="nav nav-pills">
                    <li class="nav-item"><a href="#" class="nav-link">INICIAR SESSION</a></li>
                    <li class="nav-item"><a href="#" class="nav-link">REGISTRARSE</a></li>
                </ul>
            </header>
        </div>
        <div class="container">
            <button style="margin-right: 80px" href="#" type="button" class="btn btn-primary btn-sm"><i class="fa-solid fa-person"></i>  Asesores</button>
            <button href="#" type="button" class="btn btn-secondary btn-sm"><i class="fa-solid fa-car-side"></i>  Automoviles</button>
            <button href="color_autoControlador" type="button" class="btn btn-secondary btn-sm"><i class="fa-solid fa-car-side"></i>  Color</button>

        </div>
        <br><br>


        <div class="container">
            <a href="AutomovilControlador?action=add" class="btn btn-primary btn-sm"> <i class="fa-solid fa-circle-plus"> </i> NUEVO AUTOMOVIL</a>
            <br><br>
            <table class="table table-striped">
                <tr>
                    <th>ID</th>
                    <th>Matricula</th>
                    <th>Marca</th>
                    <th>Modelo</th>
                    <th>Color</th>
                    <th>Tipo</th>
                    <th>Precio</th>
                    <th>Motor</th>
                    <th>Fecha</th>
                    <th>Observaciones</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach var="item" items="${tabla}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.matricula}</td>
                        <td>${item.marca}</td>
                        <td>${item.modelo}</td>
                        <td>${item.color}</td>
                        <td>${item.tipo_auto}</a></td>
                        <td>${item.precio}</td>
                        <td>${item.motor}</td>
                        <td>${item.fecha_fab}</td>
                        <td>${item.observaciones}</td>
                        <td><a href="AutomovilControlador?action=edit&id=${item.id_automovil}"><i class="fa-regular fa-pen-to-square"></i></a></td>
                        <td><a href="AutomovilControlador?action=delete&id=${item.id_automovil}" onclick="return(confirm('Esta seguro????'))">
                                <i class="fa-solid fa-trash-can"></i>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <footer class="text-muted py-5">
            <div class="container">
                <b><p class="contacto" style="color:red; " >Contactanos</p></b>
                <p class="contacto">75849694</p>
                <p class="contacto"> <a href="/">ventaAutomoviles@gmail.com</a></p>
            </div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
