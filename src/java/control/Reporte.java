/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;


public class Prueba {

	private String url;
	private String driver;
	private String usuario;
	private String contrasena;
	
	public Prueba(){
            
	ConexionSQLServer conexionSQL = new ConexionSQLServer();
        Conexion = conexionSQL.conectar();   
	}
	
	/**
	 * Ejecuta la consulta que se encuentra con etiqueta igual a consultaEjecutarJDBC
	 * en el archivo de propiedades config.properties.
	 * Al modificar la consulta se deben cambiar los tipos de datos correspondientes al 
	 * retorno y en la sección que imprime se debe indicar la clase correspondiente.
	 */
	public void ejecutarConsulta(){
		Connection conn = null;
		String consultaEmpleado = "SELECT OrdenesDeServicio, numeroServicio, " +
						  		  "HV_PERSONA.SEGUNDONOMBRE, HV_PERSONA.PRIMERAPELLIDO, " +
						  		  "HV_PERSONA.SEGUNDOAPELLIDO;					  		  			  		 

		String consultaConcepto = "SELECT CO_CONCEPTO.DESCRIPCION CONCEPTO, " +
								  "CO_CONCEPTO.BASERETENCION BASERETENCION, " +
								  "HV_CONCEPTOEMPLEADO.VALOR VALOR, " +
								  "HV_CONCEPTOEMPLEADO.FECHAINICIO FECHAINICIO " +
								  "FROM HV_CONCEPTOEMPLEADO, CO_CONCEPTO " +
								  "WHERE HV_CONCEPTOEMPLEADO.IDEMPLEADO = ? " +
								  "AND HV_CONCEPTOEMPLEADO.IDCONCEPTO = CO_CONCEPTO.ID";
		
		OutputStream salidaOs = null;
		
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + nombreBD, usuario, contrasena);
			
			PreparedStatement preparedStatementEmpleado = conn.prepareStatement(consultaEmpleado);
			preparedStatementEmpleado.setLong(1, 49892L);
		
			ResultSet rsEmpleado = preparedStatementEmpleado.executeQuery();
			
			HashMap<String, String> datosGeneralesEmpleado = new HashMap<String, String>();
			
			while (rsEmpleado.next()){
				datosGeneralesEmpleado.put("NUMERODOCUMENTO", rsEmpleado.getString("NUMERODOCUMENTO") == null ? "" : rsEmpleado.getString("NUMERODOCUMENTO"));
				datosGeneralesEmpleado.put("PRIMERNOMBRE", rsEmpleado.getString("PRIMERNOMBRE") == null ? "" : rsEmpleado.getString("PRIMERNOMBRE"));
				datosGeneralesEmpleado.put("SEGUNDONOMBRE", rsEmpleado.getString("SEGUNDONOMBRE") == null ? "" : rsEmpleado.getString("SEGUNDONOMBRE"));
				datosGeneralesEmpleado.put("PRIMERAPELLIDO", rsEmpleado.getString("PRIMERAPELLIDO") == null ? "" : rsEmpleado.getString("PRIMERAPELLIDO"));
				datosGeneralesEmpleado.put("SEGUNDOAPELLIDO", rsEmpleado.getString("SEGUNDOAPELLIDO") == null ? "" : rsEmpleado.getString("SEGUNDOAPELLIDO"));
				datosGeneralesEmpleado.put("NOMBRECOMPANIA", rsEmpleado.getString("NOMBRECOMPANIA") == null ? "" : rsEmpleado.getString("NOMBRECOMPANIA"));
				datosGeneralesEmpleado.put("CARGO", rsEmpleado.getString("CARGO") == null ? "" : rsEmpleado.getString("CARGO"));
				datosGeneralesEmpleado.put("FECHAINGRESO", rsEmpleado.getString("FECHAINGRESO") == null ? "" : rsEmpleado.getString("FECHAINGRESO"));
			}
			
			PreparedStatement preparedStatementConceptos = conn.prepareStatement(consultaConcepto);
			preparedStatementConceptos.setLong(1, 49892L);
			ResultSet resultSetConceptos = preparedStatementConceptos.executeQuery();
			Collection<Map<String, String>> conceptosEmpleado = new ArrayList<Map<String, String>>();
			while (resultSetConceptos.next()){
				Map<String, String> concepto = new HashMap<String, String>();
				concepto.put("CONCEPTO", resultSetConceptos.getString("CONCEPTO") == null ? "" : resultSetConceptos.getString("CONCEPTO"));
				concepto.put("BASERETENCION", resultSetConceptos.getString("BASERETENCION") == null ? "" : resultSetConceptos.getString("BASERETENCION"));
				concepto.put("VALOR", resultSetConceptos.getString("VALOR") == null ? "" : resultSetConceptos.getString("VALOR"));
				concepto.put("FECHAINICIO", resultSetConceptos.getString("FECHAINICIO") == null ? "" : resultSetConceptos.getString("FECHAINICIO"));
				conceptosEmpleado.add(concepto);
			}
			
			InputStream inputStream = new FileInputStream(new File("D:/Diana/PruebasJasperReports/PruebaReporte.jasper"));
			
			JasperReport report = JasperCompileManager.compileReport("D:/Diana/PruebasJasperReports/PruebaReporte.jrxml");
			JasperPrint jasperPrint = JasperFillManager.fillReport(report, datosGeneralesEmpleado, new JRMapCollectionDataSource(conceptosEmpleado));
			JasperExportManager.exportReportToPdfFile(jasperPrint, "D:/Diana/PruebasJasperReports/PruebaReporte.pdf");
			File archivoTemporal = File.createTempFile("prefijoArchivo", ".pdf", new File("D:/Diana/PruebasJasperReports/"));
			salidaOs = new FileOutputStream(archivoTemporal);
			
			JasperExportManager.exportReportToPdfStream(jasperPrint, salidaOs);
			//archivoTemporal.deleteOnExit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn != null){
					conn.close();
				}
				if(salidaOs !=null){
					salidaOs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}				
		}
	}
	
	public static void main(String[] args) {
		Prueba prueba = new Prueba();
		prueba.ejecutarConsulta();
	}
}
