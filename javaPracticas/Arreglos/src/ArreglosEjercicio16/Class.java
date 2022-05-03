/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio16;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
 
    public int inputNumbers(int k , int j)
    {
        int numbers = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota "+(k+1)+" del Arreglo "+j));
        while(numbers < 0 && numbers > 10)
        {
            numbers = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nIngrese la nota "+(k+1)+" del Arreglo "+j));
        }
        return numbers;
    }
    
}
