<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.88.1">


        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">

        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" rel="stylesheet">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

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

            html,
            body {
                height: 100%;
                background-image: url(https://cdn2.atraccion360.com/media/aa/lampara.gif);
                background-size: 100%;
                background-position: center center;
            }

            body {
                display: flex;
                align-items: center;
                padding-top: 80px;
                padding-bottom: 80px;
                background-color: #f5f5f5;
            }

            .form-signin {
                width: 100%;
                max-width: 500px;
                padding: 30px;
                margin: auto ;
                border-color:teal;
                border-style: ridge;
                border-radius: 30px;
                background-color: transparent;
                
             }

            .form-signin .checkbox {
                font-weight: 400;
            }

            .form-signin .form-floating:focus-within {
                z-index: 2;
            }

            .form-signin input[type="text"], input[type="number"], input[type="date"], input[type="email"]{
                margin-bottom: 10px;
                border-bottom-right-radius: 0;
                border-bottom-left-radius: 0;
                border-radius: 20px;
                background-color: transparent;
                color: white;
            }

            .form-signin input[type="password"] {
                margin-bottom: 10px;
                border-top-left-radius: 0;
                border-top-right-radius: 0;
                border-radius: 20px;
                background-color: transparent;
                color: white;
            }

            .h3 {
            	font-family: Verdana;
            	font-size: 35px;
            	color: white;
            }

            .mb-4 {
            	border-radius: 80px;
            }

            .font {
            	color: white;
  				text-transform: uppercase;
  				font-weight: 500;
  				letter-spacing: 5px;
  				padding-bottom: 15px;
            }
            
            .form-control {

            }

            .label{
            	color: gray;
            }

            .sub {
            	border-radius: 15px;
            	color: black;
            	background-color: transparent;
            	display: block;
            	margin-top: 25px;
            	margin-left: 1px;
            	border: 2px ridge teal;
				margin: 20px auto;
				text-align: center;
				padding: 15px 40px;
				outline: none;
				color: white;
				border-radius: 25px;
				cursor: pointer;
				text-transform: uppercase;
				font-weight: 150;
				 
            }

        </style>
	<title>Registro_Usuarios</title>
    </head>
    <body>
        <main class="form-signin w-100 m-auto">

	<form action="" method="post">

		<h1 class="font">Registrate</h1>
		
		<div class="form-floating">
		<input type="number" min="0" required id="ci" placeholder="Cedula Identidad" class="form-control">
		<label class="label" for="ci">Celula Identidad</label>
		</div>	

		<div class="form-floating">
		<input type="text" id="n" required placeholder="Nombres" class="form-control">
		<label class="label" for="n">Nombres</label>
		</div>	

		<div class="form-floating">
		<input type="text" id="a" required placeholder="Apellidos" class="form-control">
		<label class="label" for="a">Apellidos</label>
		</div>	

		<div class="form-floating">
		<input type="date" id="f" required placeholder="f" class="form-control">
		<label class="label" for="f"></label>
		</div>	

		<div class="form-floating">
		<input type="number" id="cel" required placeholder="Numero Celular" class="form-control">
		<label class="label" for="cel">Celular</label>
		</div>	

		<div class="form-floating">
		<input type="email" id="c" required placeholder="Correo" class="form-control">
		<label class="label" for="c">Correo@</label>
		</div>	

		<div class="form-floating">
		<input type="text" id="u" required placeholder="Usuario" class="form-control">
		<label class="label" for="u">Usuario</label>
		</div>	

		<div class="form-floating">
		<input type="password" id="con" required placeholder="Contraseña" class="form-control">
		<label class="label" for="con">Contraseña</label>
		</div>	

		<div class="form-floating">
		<input type="password" id="conn" required placeholder="Repetir Contraseña" class="form-control">
		<label class="label" for="conn">Repetir Contraseña</label>
		</div>	

	

                <input type="submit" value="Registrate" class="sub" style="float:left;">
		
		<input type="submit" value="Cancelar" class="sub" style="float: right;">
		
	</form>

	</main>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
