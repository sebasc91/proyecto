<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylos/estiloformusuarios.css"></link>
        <title>Usuarios</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <!-- Bootstrap Core CSS -->
        <link href="stylos/bootstrap.min.css" rel="stylesheet">
        <link href="stylos/bootstrap.css" rel="stylesheet">
        <link href="stylos/styles.css" rel="stylesheet"> 
    </head>
    <body background="img/principal.png">
        <form name="Usuarios" action="ServCrudUsuarios" method="POST">     
            <div class="logoencabezadoformUsuarios">
                <table border="0">
                    <tbody>
                        <tr>
                            <td><img src="img/encabezado.png" width="1230" height="100" alt="logoencabezadoppalg"/><br>   
                            </td>
                       </tr>
                    </tbody>
                   <div class="h1"><h1>            </h1> </div>
                </table><br>
                <div class="justificacionformUsuarios" align="center">
                    <table border="1"width="840" heigth="1250" align="center">
                        <tr>
                            <td>        
                                <table border="0" alingn="center"> 
                                        <p class="lead">USUARIOS</p>
                                        <tr>
                                            <td width="20%">Id usuario :   </td>
                                            <td width="50%"><input type="text" size="53" name="idUsuario" value="${requestScope['usuario'].idUsuario}" >*</td>
                                       </tr>
                                       <tr>
                                           <td width="20%">Nombre usuario :   </td>
                                           <td width="50%"><input type="text" size="53" name="NombreUsuario" value="${requestScope['usuario'].nombreUsuario}" >*</td>
                                       </tr>
                                       <tr>
                                           <td width="20%"> Nombre  :   </td>
                                           <td width="50%"><input type="text" size="53" name="Nombre" value="${requestScope['usuario'].nombre}" >*</td>
                                       </tr>
                                       <tr>
                                          <td width="20%"> Apellidos :      </td>
                                          <td width="50%"><input type="text" size="53" name="Apellidos" value="${requestScope['usuario'].apellidos}">*</td>
                                       </tr>                                       
                                       <tr>
                                         <td width="20%"> Correo :      </td>
                                         <td width="50%"><input type="text" size="53" name="Correo" value="${requestScope['usuario'].correo}">*</td>
                                       </tr> 
                                        <tr>
                                          <td width="20%"> Password :      </td>
                                          <td width="50%"><input type="password" size="53" name="Password" value="${requestScope['usuario'].password}">*</td>
                                       </tr>  
                                       <tr>
                                       <td width="20%"> Tipo Usuario :      </td>
                                       <td width="50%">
                                        <select id="TipoUsuario" name="so">
                                        <option value="1" selected="selected" size="53">Administrador</option>
                                         <option value="3">Cliente</option>
                                          <option value="2">Jefe Taller</option>
                                          <option value="4">Técnico</option>
                                        </select>
                                           </td>
                                       </tr>
                                  </tbody>
                               </table><br>
                          <div class="botones"> 
                              <input type="hidden" name="op" id="inputOp" value="0">
                              <input type="image" value="Guardar" src="img/guardar1.jpg"title="Guardar" width="40" height="40" alt="guardar1" onclick="javascript:document.getElementById('inputOp').value='1';" />
                              <input type="image" src="img/consultar2.jpg"title="Consultar"  width="40" height="40" alt="consultar2" onclick="javascript:document.getElementById('inputOp').value='2';"/>
                              <input type="image" src="img/modificar.jpg"title="Modificar" width="40" height="40" alt="modificar" onclick="javascript:document.getElementById('inputOp').value='3';" />
                              <input type="image" src="img/eliminar3.jpg"title="Eliminar" width="40" height="40" alt="eliminar3" onclick="javascript:document.getElementById('inputOp').value='4';"/>
                              <input type="image" src="img/limpiar.jpg"title="Limpiar" width="40" height="40" alt="limpiar" onclick="javascript:document.getElementById('inputOp').value='5';"/>
                          </div>
                        <br><br>
                        </td>
                        </tr>
                   </table>
                    <a align="left" type="image" src="img/home1.jpg" href="menuprincipal.jsp"width="40" height="40">Principal</a>
                </div>
            </div>
         </form>                                       
    </body>
</html>


