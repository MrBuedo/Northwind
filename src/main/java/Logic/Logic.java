/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import DTO.Products;
import java.util.ArrayList;

/**
 *
 * @author alu
 */
public class Logic {
    private ArrayList<Products> listaProductos;
    
    public Logic (ArrayList<Products> lista){
        listaProductos=lista;
    }
            
    public Logic (){
       listaProductos = new ArrayList<Products>();
        listaProductos.add(new Products(1,"Chai",18));
        listaProductos.add(new Products(2,"Chang",19));
    } 

    public ArrayList<Products> getListaProductos() {
        return listaProductos;
    }
    
    
               
            
            
            
    
}
