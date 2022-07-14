/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.nbcf.tablemodel;

import io.github.com.nbcf.sacolaosoftware.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;



 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION 8 - 14
 * NETBEANS     8.2 - 12
 * 
 * Created on 30/12/2021, 03:20:27
 */
public class CategoriaTableModel extends AbstractTableModel {
       private List<Categoria> valores = new ArrayList();
       
  
public CategoriaTableModel(List<Categoria> categoria) {
        this.valores = categoria;
    }

    public int getRowCount() {
        return valores.size();
    }
    public int getColumnCount() {
        return 2;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        
       Categoria compras = valores.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return compras.getId();
            case 1:
                return compras.getNome();
         
 

            default:
               return "";
        }
    }
        
    public void adicionar(Categoria addCat){
	valores.add(addCat);
	fireTableRowsInserted(valores.size() - 1, valores.size() - 1);
	}
    
    public void remover(Categoria removerCat){
	valores.remove(removerCat);
	fireTableRowsInserted(valores.size() - 1, valores.size() - 1);
	}
    
    @Override
    public String getColumnName(int coluna) {
        switch (coluna) {
            case 0:
                return "CÓDIGO";     
            case 1:
                return "COMPRA";
         
            default:
         return "";
    }
  }
     public boolean isCellEditable(int rowIndex, int columnIndex) {
     return false;
    }
    
     public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return Integer.class;
        } else if (columnIndex == 1){
            return String.class;
        }
         else if (columnIndex == 2){
            return Object.class;
        }


        return null;
    }

    public Categoria get(int row) {
        return valores.get(row);
    }
}
