<%-- 
    Document   : DescargaHorInstructor
    Created on : 10/05/2014, 06:12:43 PM
    Author     : LUIS FERNANDO URREGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylos/estiloformusuarios.css"></link>
        <title>DescargaHorInstructor</title>
        
    </head>
    <body>
      <form name="Instructor" action=" " method="POST">     
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
                            <td>        
                                <table border="0">
                                    <tbody>
                                        <tr><br>
                                            <tr>
                                          <td width="20%"> Seleccione el programa : 
                                         <td width="50%"><select name="">
                                            <option>Programación de sw</option>
                                            <option>Analisis</option>
                                            <option>otro</option>
                                            </select>  
                                         </td>
                                       </tr>
                                       
                                       <tr>
                                          <td width="20%"> Digite número de ficha :      </td>
                                          <td width="50%"><input type="text" size="20" name="Ficha" value="">*</td>
                                       </tr>
                               </table><br>
                    
                          <div class="botones"> 
                              
                              <input type="submit" value="Descargar" width="20" height="40" />
                             
                          </div>
                            <br><br>
                        </td>
                        </tr>
                   </table>
                </div>
             </div>
         </form>
        
    </body>
</html>
