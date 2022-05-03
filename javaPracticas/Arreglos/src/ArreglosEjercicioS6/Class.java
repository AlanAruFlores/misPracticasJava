/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicioS6;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    
    public int inputNumbersArray(int i)
    {
       int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+ " del Arreglo 1"));
       
       return number;
    }
        
    public int inputNumbersArray2(int i)
    {
       int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+ " del Arreglo 2"));
       
       return number;
    }
}
