

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylos/estiloformusuarios.css">
        <title>Actividades</title>
    </head>
    <body>
        <form name="Actividades" action="ServCrudActividades" method="POST">  
         <div class="logoencabezadoformUsuarios">
        <table border="0">
            <tbody>
                <tr>
                    <td><img src="img/logoencabezadoppal.jpg" width="1230" height="100" alt="logoencabezadoppalg"/><br>   
                    </td>
                    
                </tr>
            </tbody>
        </table><br>
            <div class="justificacionformUsuarios">
            <table border="1"width="1240" heigth="1250">
            <tr>
<td>        <table border="0">
            <tbody>
                
         
                <tr><br>
                    <td width="20%"> Id Actividad :   </td>
                    <td width="50%"><input type="text" size="53" name="idActividad" value="${requestScope['actividad'].idActividad}"></td>
    </tr>
    
                    <td width="20%"> Actividad del proyecto :   </td>
                    <td width="50%"><input type="text"  size="80" name="ActividadProyecto" value="${requestScope['actividad'].actividadProyecto}"></td>
  <tr>             
                    <td width="20%"> Actividad de Aprendizaje :   </td>
                    <td width="50%"><input type="text" size="80" name="ActividadAprendizaje" value="${requestScope['actividad'].actividadAprendizaje}"></td>
                    
                    <tr><br>
                     <td width="20%">               </td>
                     <td width="50%"><input type="text" size="53" name="mensaje" value="${requestScope['mensaje'].mensaje}" ></td>
                                       </tr>
                    
                 
    </tr>  
    
    <tr>
    
    </tr>
            </tbody>
        </table><br>
                   
                    <div class="botones">  
                    <input type="hidden" name="op" id="inputOp" value="0">   
                    <input type="image" value="Guardar" src="img/guardar1.jpg"title="Guardar" width="40" height="40" alt="guardar1" onclick="javascript:document.getElementById('inputOp').value='1';"/>
                    <input type="image" src="img/consultar2.jpg"title="Consultar"  width="40" height="40" alt="consultar2" onclick="javascript:document.getElementById('inputOp').value='2';"/>
                    <input type="image" src="img/modificar.jpg"title="Modificar" width="40" height="40" alt="modificar" onclick="javascript:document.getElementById('inputOp').value='3';" />
                    <input type="image" src="img/eliminar3.jpg"title="Eliminar" width="40" height="40" alt="eliminar3" onclick="javascript:document.getElementById('inputOp').value='4';"/>
                    <input type="image" src="img/limpiar.jpg"title="Limpiar" width="40" height="40" alt="limpiar" onclick="javascript:document.getElementById('inputOp').value='5';"/>

                    <br><br>
</td>
             </tr>
             </table>
            </tbody>
    </body>
</html>
