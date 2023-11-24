
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoDatos {
	
    private Connection con;
    
    public AccesoDatos() {
    	this.con =this.Conectar();
    }
    
    public Connection getCon() {
		return con;
	}

    public void setCon(Connection con) {
            this.con = con;
    }

	/** >>>Conectar <<<
     * returns a Connection object
     */
    
    public Connection Conectar(){
        Connection con = null;
        try{
            Class.forName("org.sqlite.JDBC");        	
        	// ESTABLECER LA CONEXIÓN con la base de datos
            con = DriverManager.getConnection("jdbc:sqlite:D:\\Documentos\\NetBeansProjects\\Northwind\\DB\\northwind.db");            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error en la conexión de la base de datos");
            ex.printStackTrace();  
        }
        return con;
    }
    
     /** >>>Desconectar <<<
     * return: it returns nothing
     */
    public void Desconectar(Connection con){
        if(con!=null){
            try {
                con.close();
                System.out.println("La conexión "+con.toString()+" se ha cerrado correctamente");
            } catch (SQLException ex) {
                Logger.getLogger(ConfigCon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }
    
}
