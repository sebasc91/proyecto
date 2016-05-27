<%-- 
    Document   : Ambientes
    Created on : 27/04/2014, 03:05:16 PM
    Author     : LUIS FERNANDO URREGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylos/estiloformusuarios.css">
        <title>Ambientes</title>
    </head>
    <body>
        <form name="Ambientes" action="ServCrudAmbientes" method="POST">  
         <div class="logoencabezadoformUsuarios">
             		       <div class="h1"><h1>       </h1> </div>
        <table border="0">
            <tbody>
                <tr>
                    <td><img src="img/encabezado.png" width="1230" height="100" alt="encabezado"/><br>   
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
                    <td width="20%"> Cod Puntos Atención :   </td>
                    <td width="50%"><input type="text" size="53" name="idAmbiente" value="${requestScope['ambiente'].idAmbiente}">*</td>
    </tr>
                    <tr><td width="20%"> Ciudad :   </td>
                        <td width="50%"><input type="text" size="53" name="idAmbiente" value="${requestScope['ambiente'].idAmbiente}">*</td>
                        </tr>
                        <tr><td>
                    <select name="FICHA">
                        <option> Ciudad</option>
                        <td width="50%"><input type="text" size="53" name="idAmbiente" value="${requestScope['ambiente'].idAmbiente}">*</td>
                        <option>${Fichas.Ficha} </option>
                        <option>${Fichas.Ficha} </option>
                       
                        
                        
                        <%--
                        consulta= conexion.createStatement();
                        ResultSet resultado=null;
                        resultado=consulta.executeQuery("select * from PlaneacionHorario where idFicha= " + h.getIdFicha());   
                         
                        while(resultado.next()){
                        String fnombre = rs.getString("nombre");   
                        
                       <option option value="<%=idFicha%>"><%=NombreFicha%></option>
                        --%>
</select>       </td>        
    </tr>
                    <tr><br>
                    <td width="20%"> Dirección :   </td>
                    <td width="50%"><input type="text" size="53" name="idAmbiente" value="${requestScope['ambiente'].idAmbiente}">*</td>
    </tr>
                    <tr><br>
                    <td width="20%"> Teléfono :   </td>
                    <td width="50%"><input type="text" size="53" name="idAmbiente" value="${requestScope['ambiente'].idAmbiente}">*</td>
    </tr>
                    <td width="20%"> Correo :   </td>
                    <td width="50%"><input type="text" size="53" name="NombreAmbiente" value="${requestScope['ambiente'].nombreAmbiente}" >*</td>
                    
                    <tr><br>
                                    <tr><br>
                    <td width="20%"> Horario de Atención </td>
                    <td width="50%"><input type="text" size="53" name="idAmbiente" value="${requestScope['ambiente'].idAmbiente}">*</td>
    </tr>
                     <td width="20%">               </td>
                     <td width="50%"><input type="text" size="53" name="mensaje" value="${requestScope['mensaje'].mensaje}" ></td>
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
