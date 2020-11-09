
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JOSE CRUZADO
 */
public class ColorRows extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        String[] str = table.getValueAt(row, 0).toString().split(" ");
        if(str[0].equals("ERROR")){
            setForeground(Color.red);
        }
        else{
            setForeground(Color.BLACK);
        }
        
        return this;
    }
}
