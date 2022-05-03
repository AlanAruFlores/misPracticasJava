/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio5;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    public int inputNumbers(int i)
    {
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+" del Arreglo 1"));
        return number;
    }
    public int inputNumbers2(int i)
    {
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+" del Arreglo 2"));
        return number;
    }
    
}
