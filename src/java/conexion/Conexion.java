package conexion;

import java.sql.Connection;

/**
 *
 * @author USUARIO
 */
public abstract class Conexion {
   
    public abstract Connection conectar();
    public abstract void desconectar(Connection conn);
}
