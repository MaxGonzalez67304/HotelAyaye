
package baseDatos;

import java.sql.Connection;//interface
import java.sql.DriverManager;//clase
import java.sql.SQLException;
import java.sql.Statement;//interface
import java.sql.ResultSet;//interface
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConn {
    public Statement stmt = null;
    public ResultSet rs = null;
    public Connection conn = null;

    public MySqlConn () {
        //Conectar con mysql...
        try {
            //cargando el driver
            Class.forName("com.mysql.jdbc.Driver");
         /*   String connectionUrl =
                            "jdbc:mysql://148.211.152.233/progsist?"
                            +"user=isc&password=isc";*/
            String connectionUrl =
                            "jdbc:mysql://localhost/hotel?"
                            +"user=root&password=";

            // conexion con la base de datos
            conn = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: " + cE.toString());
        }
    }
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/hotel?"
                            + "user=root&password=");
            
        } catch(SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySqlConn.class.getName()).log(Level.SEVERE, null, ex);
        }
      return conn;  
    }
    
    
    public void Consult(String query){
        //information_schema
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query); //envia una consulta y devuelve un objeto ResultSet para su implementacion
            if (rs!=null) {
                rs = stmt.getResultSet(); //obtiene los resultados
                //se coloca sobre el primer registro
                rs.first();
            }
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("Error: " + ex.getErrorCode());
        }
    }
    public int Update(String query){
        //information_schema
        int rModif=0;
        try {
            stmt = conn.createStatement();
             rModif= stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("Error: " + ex.getErrorCode());
        }
        return rModif;
    }


    public void closeRsStmt(){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException sqlEx) { } // ignore
            rs = null;
        }
        if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore
                stmt = null;
         }
    }
    
    public void closeConnection() {
         try {
               if (conn!=null)  conn.close();
            } catch (SQLException sqlEx) { } // ignore
            rs = null;
    }

}
