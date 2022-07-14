/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.nbcf.renderer;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author nil_b
 */
public class CorDoubleCellRenderer extends DefaultTableCellRender{

    
       
JLabel label = new JLabel();
ImageIcon icone;


 
  @Override
	  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
              
            setBackground(row % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
            setForeground(new Color(51, 51, 51)); 
            setHorizontalAlignment(JLabel.CENTER);
        return c;
    }

        
}
