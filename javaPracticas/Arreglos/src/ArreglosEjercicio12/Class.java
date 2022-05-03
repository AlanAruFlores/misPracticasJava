/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio12;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    public int inputValues(int i)
    {
        int number= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
        
        return number;
    }
    public int delete()
    {
        int deletePosition;
        boolean verificar = false;
        do
        {
            deletePosition = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"
                + " entre el 0 y 9"));
            if(deletePosition <0 || deletePosition>9)
            {
                verificar = true;
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        
        }while(verificar == true);
        
        return deletePosition;
    }
    
}
