<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.88.1">
        <title>Signin Template · Bootstrap v5.1</title>

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
                background-image: url(https://static.vecteezy.com/system/resources/previews/001/986/145/original/glowing-silver-sport-car-on-black-background-vector.jpg);
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
                max-width: 380px;
                padding: 60px;
                margin: auto;
                border-color:black;
                border-style: solid;
                border-radius: 30px;
                background-image: url(https://st.depositphotos.com/1795881/1409/i/600/depositphotos_14099763-stock-photo-black-diamond-facet-background.jpg);
             }

            .form-signin .checkbox {
                font-weight: 400;
            }

            .form-signin .form-floating:focus-within {
                z-index: 2;
            }

            .form-signin input[type="text"] {
                margin-bottom: -1px;
                border-bottom-right-radius: 0;
                border-bottom-left-radius: 0;
                border-radius: 20px;
                background-color: black;
            }

            .form-signin input[type="password"] {
                margin-bottom: 10px;
                border-top-left-radius: 0;
                border-top-right-radius: 0;
                border-radius: 20px;
                background-color: black;
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
            }
            
            .form-control {

            }
        </style>
    </head>
    <body class="text-center">
        
        <main class="form-signin w-100 m-auto" >

		<h1 class="h3 mb-3 fw-normal">Iniciar Sesión</h1>
	<form class="row gy-2 gx-3 align-items-center" method="post">
		<img class="mb-4" src="https://www.citypng.com/public/uploads/small/11639594342hjraqgbufi3xlb66lt30fz1pwfcydxkjqbynfqdpvufz41ysjtngiet4dyrywgqqqqu56w5nozgrhyecs4ixrlllkl150ogbiid1.png" whidth="50" height="190">

		<div class="form-floating">
			<input style="color:white;" type="text" id="u" placeholder="Correo Electrónico" required class="form-control">
			<label class="font" for="u">Correo Electrónico</label>
		</div>

		<div class="form-floating">
			<input style="color:white;" type="password" id="p" placeholder="Contraseña" required class="form-control">
			<label class="font" for="p" class="form-label">Contraseña</label>
		</div>

		<div class="col-auto">
			<input type="checkbox" id="o" class="form-check-input">
			<label style="color:white;" for="o" class="form-check-la">Recordar contraseña</label>
		</div>

		<div>
			<input type="submit" value="Ingresar" class="w-100 btn btn-outline-secondary">
		</div>

		<div class="col-auto">
			<a href="#">Olvido su contraseña?</a>
		</div>
	</form>
	</main>
	

	            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        
    </body>
</html>
