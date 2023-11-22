/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DTO.Products;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alu
 */
public class ProductsTableModel extends AbstractTableModel {

    private ArrayList<Products> listaProductos;

    public ProductsTableModel(ArrayList<Products> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    
    @Override
    public int getRowCount() {
       return listaProductos.size();
    }

    @Override
    public int getColumnCount() {
        return Products.class.getDeclaredFields().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listaProductos.get(rowIndex).getProductID();
            case 1:
                return listaProductos.get(rowIndex).getProductName();
            case 2:
                return listaProductos.get(rowIndex).getUnitPrice();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String titulo = Products.class.getDeclaredFields()[column].toString();
        int numPuntos=0;
        int posPunto=0;
        for(int i = 0; i < titulo.length();i++){
            if(titulo.charAt(i)==46){
                numPuntos++;
                posPunto=i;
                //System.out.println("Encontrado punto en "+i+" guardado en "+posPunto);
            }
        }
        //return " "+posPunto;
        return titulo.substring(posPunto+1);
       //return Products.class.getDeclaredFields()[column].toString();
       
    }
    
    
    
}
