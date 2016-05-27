package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class ConexionSQLServer extends Conexion {

    @Override
    public Connection conectar() {
        Connection con = null;
        try {
            //llama el controlador jar, buscarlo ruta en prestaciones
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //llama ruta base de datos, buscarla en pestaña prestaciones
            String Ruta = "jdbc:sqlserver://localhost:1433;" + "databaseName=prueba";
            //digitar datos de usuario creado en sql 2012
            con = DriverManager.getConnection(Ruta, "sa", "sa");
        } catch (Exception e) {
        }

        return con;
    }

    @Override
    public void desconectar(Connection conn) {

        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
        }

    }

}
