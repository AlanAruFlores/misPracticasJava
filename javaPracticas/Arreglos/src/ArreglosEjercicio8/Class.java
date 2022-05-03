/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio8;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    
    public int inputNumbers( int i)
    {
        int numbers = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+ (i+1)));
        
        
        return numbers;
    }
}
