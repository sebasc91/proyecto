<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet"  href="stylos/login.css"  type="text/css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <!-- Bootstrap Core CSS -->
        <link href="stylos/bootstrap.min.css" rel="stylesheet">
        <link href="stylos/bootstrap.css" rel="stylesheet">
        <link href="stylos/styles.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="stylos/login.css" rel="stylesheet">

     
        
        
        
        <script type="text/javascript">

            function loginAprendiz() {
                //    alert("hizo click0");
                document.forms.login.action = "Aprendiz.jsp";
                document.forms.login.submit();
            }
        </script>
    </head>
    <body>
        <%
            String error = (String) request.getAttribute("error");
        %>
        <form name="login" action="ServLog" method="POST">   
            <table border="0">
                <thead>
                    <tr>
                        <th><img src="img/encabezado.png" width="1000" height="100" alt="encabezado"/><br><br>
                <div class="fondologinusuario"></div>
                <div class="alineacionimagenreloj">
                    <div class="fondoazullogin">  
                        <table border="0">
                            <tr><br><br>
                            <td><img src="img/motocicleta3.png" width="600" height="300" alt="principal"/>
                            </td>                   
                            <br>
                            <td> <table border="0" width="150"> <br>
                                    <div class="justificacioncuadrologin" align="center">                        
                                        <div class="h1"><h1>AUTENTICACION</h1> 
                                        <%                           if (error != null) {
                                        %>
                                        <h3><%=error%></h3>    
                                        <%
                                            }
                                        %>
                                        </div>
                                        <div id="fondologinusuario">
                                            <div class="hover"><br>
                                                Usuario   <br><input type="text"  name="usuario" ><br>
                                                Contraseña<br><input  type="password" name="password"><br>
                                                <input type="checkbox"  name="recordar" value="ON"> Recordar<br><br><br> 
                                                <input type="submit" name="aceptar" value="Aceptar">
                                                <div class="olvidocontraseña">
                                                    <h4>¿Olvidó su contraseña?</h4></div>   
                                            </div>
                                        </div>
                                    </div>
                                </table>
                        </table>
                        </table>
                        </form>
                        </thead>    
                        </body>