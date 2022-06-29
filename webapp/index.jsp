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
    <body >

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



        </style>

        <h1 class="visually-hidden">VENTA DE AUTOMOVILES</h1>

        <div class="container">
            <div class="collapse" id="navbarToggleExternalContent">
                <div class="bg-dark p-4">
                    <a href="AutomovilControlador" class="btn btn-light btn-sm">Automoviles</a>
                    <a href="controladorCargos" class="btn btn-light btn-sm">Cargos de Empleados</a>
                    <a href="controladorClientes" class="btn btn-light btn-sm">Nuestros Clientes</a>
                    <a href="controladorColor" class="btn btn-light btn-sm">Color de Automoviles</a>
                    <a href="controladorEmpleados" class="btn btn-light btn-sm">Nuestros Asesores</a>
                    <a href="controladorMarca" class="btn btn-light btn-sm">Marcas de Automoviles</a>
                    <a href="tipo_autoControlador" class="btn btn-light btn-sm">Tipo de Automovil</a>
                </div>
            </div>
            <nav class="navbar navbar-dark bg-dark">
                <div class="container-fluid">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                </div>
            </nav>
        </div>
        <div class="container">
            <div class="container">
                <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
                    <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
                        <img class="bi me-2" width="40" height="32" src="https://www.purosautos.com/wp-content/uploads/2018/05/2017-Chevrolet-Camaro-Compare.png"/>
                        <span class="fs-4">VENTA DE AUTOMOVILES</span>
                    </a>

                    <ul class="nav nav-pills">
                        <li class="nav-item"><a href="Ingresar.jsp" class="nav-link">Iniciar Sesion</a></li>
                        <li class="nav-item"><a href="nuevoregistro.jsp" class="nav-link">Registrarse</a></li>
                    </ul>
                </header>
            </div>

            <div class="container">
                <p>Llevese los mejores autos al mejor precio.</p>
                <p>Visita nuestra sucursal en el departamento de La Paz</p>
                <div class="map-responsive">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d30172.217566984502!2d-65.29600088437498!3d-19.040544799999996!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x93fbc96dff38c7bf%3A0xbe02b67e2dc3d53c!2sG.A.%20Motors%20%2F%20NISSAN!5e0!3m2!1ses!2sbo!4v1653538675049!5m2!1ses!2sbo" width="200" height="200" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>

                </div>
            </div>
            <!--FOTOS-->
            <div class="album py-5 bg-light">
                <div class="container">

                    <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                        <div class="col">
                            <div class="card shadow-sm">
                                <img class="bd-placeholder-img card-img-top" width="100%" height="225" src="https://cdn.motor1.com/images/mgl/vx4pYK/s1/2022-toyota-corolla-cross-euro-spec.jpg" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%"/>

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img class="bd-placeholder-img card-img-top" width="100%" height="225" src="https://www.notebookcheck.org/fileadmin/Notebooks/News/_nc3/Tesla_Supercharger_Model_3_bug_4.jpg" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%"/>

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img class="bd-placeholder-img card-img-top" width="100%" height="225" src="https://www.purosautos.com/wp-content/uploads/2019/03/22_toyota_corolla.jpg" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%"/>

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                </div>
                            </div>
                        </div>

                        <div class="col">
                            <div class="card shadow-sm">
                                <img class="bd-placeholder-img card-img-top" width="100%" height="225" src="https://autobild.com.mx/wp-content/uploads/2020/10/instagram10audir82.jpg" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%"/>

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img class="bd-placeholder-img card-img-top" width="100%" height="225" src="https://www.glpautogas.info/fotografias/ford-f150-lpg.jpg" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%"/>

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card shadow-sm">
                                <img class="bd-placeholder-img card-img-top" width="100%" height="225" src="https://www.glpautogas.info/fotografias/ford-f150-lpg.jpg" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%"/>

                                <div class="card-body">
                                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                                    <!--
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                    </div>
                                    -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="text-muted py-5">
                <div class="container">
                    <b><p class="contacto" style="color:red; " >Contactanos</p></b>
                    <p class="contacto">75849694</p>
                    <p class="contacto"> <a href="/">ventaAutomoviles@gmail.com</a></p>
                </div>

            </footer>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
