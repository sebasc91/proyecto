
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylos/estiloformusuarios.css"></link>
        <title>Partes y Repuestos</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <!-- Bootstrap Core CSS -->
        <link href="stylos/bootstrap.min.css" rel="stylesheet">
        <link href="stylos/bootstrap.css" rel="stylesheet">
        <link href="stylos/styles.css" rel="stylesheet"> 
    </head>
    <body>
            <body background="img/principal.png">
         <form name="Proyectos" action="ServCrudProyectos" method="POST">  
         <div class="encabezado">
             <table border="0">
            <tbody>
                <tr>
                    <td><img src="img/encabezado.png" width="1230" height="100" alt="encabezado"/><br>   
                    </td>
                    
                </tr>
            </tbody>
            		       <div class="h1"><h1>    </h1> </div>
        </table><br>
            <div class="justificacionformUsuarios">
            <table border="1"width="840" heigth="1250">
            <tr>
<td>        <table border="0">
                        <p class="lead">PARTES Y REPUESTOS</p>
            <tbody>
                    
                    <tr><br>
                    <td width="20%"> Referencia :   </td>
                    <td width="50%"><input type="text" size="53" name="idAmbiente" value="${requestScope['ambiente'].idAmbiente}">*</td>
    </tr>
                    <tr><br>
                    <td width="20%"> Nombre :   </td>
                    <td width="50%"><input type="text" size="53" name="idAmbiente" value="${requestScope['ambiente'].idAmbiente}">*</td>
    </tr>
                                       <tr>
                                       <td width="20%"> Tipo :      </td>
                                       <td width="50%">
                                        <select id="TipoParte" name="so">
                                         <option value="" selected="selected" size="53">Seleccione Tipo</option>
                                         <option value="3">Parte Mecanica</option>
                                         <option value="2">Parte Electrica</option>
                                         <option value="2">Trabajo o Tarea</option>
                                        </select>
                                           </td>
                                       </tr>                    
                       <tr>
                                       <td width="20%"> Tipo Unidad :      </td>
                                       <td width="50%">
                                        <select id="TipoUnidad" name="so">
                                        <option value="" selected="selected" size="53">Seleccione Unidad</option>
                                        <option value="1">Unidad</option>
                                        <option value="2">Galon</option>
                                        <option value="3">Hora trabajador</option>
                                        </select>
                                           </td>
                                       </tr>  
                     <td width="20%"> Valor               </td>
                     <td width="50%"><input type="text" size="53" name="mensaje" value="${requestScope['mensaje'].mensaje}" ></td>
                     </tr>
                    
                    
                    
               
            </tbody>
        </table><br>
               
                   
                    <div class="botones"> 
                    <input type="hidden" name="op" id="inputOp" value="0">
                    <input type="image" value="Guardar" src="img/guardar1.jpg"title="Guardar" width="40" height="40" alt="guardar1" onclick="javascript:document.getElementById('inputOp').value='1';"/>
                    <input type="image" src="img/consultar2.jpg"title="Consultar"  width="40" height="40" alt="consultar2" onclick="javascript:document.getElementById('inputOp').value='2';"/>
                    <input type="image" src="img/modificar.jpg"title="Modificar" width="40" height="40" alt="modificar" onclick="javascript:document.getElementById('inputOp').value='3';"/>
                    <input type="image" src="img/eliminar3.jpg"title="Eliminar" width="40" height="40" alt="eliminar3" onclick="javascript:document.getElementById('inputOp').value='4';"/>
                    <input type="image" src="img/limpiar.jpg"title="Limpiar" width="40" height="40" alt="limpiar" onclick="javascript:document.getElementById('inputOp').value='5';"/>

                    <br><br>
</td>
             </tr>
             </table>
                                                            <a align="left" type="image" src="img/home1.jpg" href="menuprincipal.jsp"width="40" height="40">Principal</a>
            </tbody>
    </body>
</html>
