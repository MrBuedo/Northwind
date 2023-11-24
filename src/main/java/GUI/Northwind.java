/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GUI;

import DAO.AccesoDatos;
import DAO.ConfigCon;
import DTO.Products;
import Logic.Logic;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alu
 */
public class Northwind {

    public static void main(String[] args) {
        
        
        
        
        /*
        PRUEBA: Se conecta a la db
        */
        
         AccesoDatos ad = new AccesoDatos();
        
        try {
            if(!ad.getCon().isClosed()){
                System.out.println("Conectado");
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Northwind.class.getName()).log(Level.SEVERE, null, ex);
        }
            /*
            Esto no es mas que una prueba para ver si el columncount del
            Producttablemodel me devolvía las columnas correctas, cosa que
            depende del numero de campos del objeto products. Funciona.
            
            ArrayList<Products> lista1 = new ArrayList<Products>();
            lista1.add(new Products(1,"Chai",18));
            lista1.add(new Products(2,"Chang",19));
            
            ProductsTableModel tablaProductos = new ProductsTableModel(lista1);
            
            System.out.println("Filas: "+tablaProductos.getRowCount()+" Columnas: "+tablaProductos.getColumnCount());
            System.out.println("Nombre: "+tablaProductos.getValueAt(1, 1));
            */
            
            /*
            Esto es una prueba para ver si el modelo de la tabla products me daba
            solo el nombre del campo que encabeza la columna. Funciona.
            Logic log = new Logic();
            ProductsTableModel ptm = new ProductsTableModel(log.getListaProductos());
            System.out.println(" Titulo: "+ptm.getColumnName(0));
            */
        
}
}
