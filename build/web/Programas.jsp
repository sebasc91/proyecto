<%-- 
    Document   : Programas
    Created on : 29/03/2014, 10:35:14 AM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylos/estiloformusuarios.css">
        <title>Parámetros</title>
    </head>
    <body>
       <form name="Programas" action="ServCrudProgramas" method="POST">  
         <div class="logoencabezadoformUsuarios">
        <table border="0">
            <tbody>
                <tr>
                    <td><img src="img/logoencabezadoppal.jpg" width="1230" height="100" alt="logoencabezadoppalg"/><br>   
                    </td>
                    
                </tr>
            </tbody>
            		       <div class="h1"><h1>Parámetros</h1> </div>
        </table><br>
            <div class="justificacionformUsuarios">
            <table border="1"width="1240" heigth="1250">
            <tr>
<td>        <table border="0">
            <tbody>
                
         
                <tr><br>
                    <td width="20%"> Id Parametro :   </td>      
                    <td width="50%"><input type="text" size="53" name="idPrograma" value="${requestScope['programas'].idPrograma}" >*</td>
    </tr>
                    <td width="20%"> Nombre Parametro :   </td>
                    <td width="50%"><input type="text" size="53" name="NombrePrograma" value="${requestScope['programas'].nombrePrograma}" >*</td>
                
              <tr><br>
                    <td width="20%">               </td>
                    <td width="50%"><input type="text" size="53" name="mensaje" value="${requestScope['mensaje'].mensaje}" ></td>
                     </tr>      
                    
                
            </tbody>
        </table><br>
                   
                    <div class="botones"> 
                    <input type="hidden" name="op" id="inputOp" value="0">
                    <input type="image" value="Guardar" src="img/guardar1.jpg"title="Guardar" width="40" height="40" alt="guardar1" onclick="javascript:document.getElementById('inputOp').value='1';" />
                    <input type="image" src="img/consultar2.jpg"title="Consultar"  width="40" height="40" alt="consultar2"onclick="javascript:document.getElementById('inputOp').value='2';"/>
                    <input type="image" src="img/modificar.jpg"title="Modificar" width="40" height="40" alt="modificar"onclick="javascript:document.getElementById('inputOp').value='3';" />
                    <input type="image" src="img/eliminar3.jpg"title="Eliminar" width="40" height="40" alt="eliminar3" onclick="javascript:document.getElementById('inputOp').value='4';"/>
                    <input type="image" src="img/limpiar.jpg"title="Limpiar" width="40" height="40" alt="limpiar" onclick="javascript:document.getElementById('inputOp').value='5';"/>

                    <br><br>
</td>
             </tr>
             </table>
            </tbody>    
        
        
        
    </body>
</html>
