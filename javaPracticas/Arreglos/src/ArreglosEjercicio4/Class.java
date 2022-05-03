/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio4;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    public int inputNumbers(int i)
    {
        int number;
        number=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"Ingrese el numero"));
        return number;
        
    }
}
