/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio7;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
 
    public int inputNumbers(int k)
    {
        int numbers = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(k+1)));
        
        return numbers;
    }
  
    public boolean verification1(int []arrayNumbers, int i)
    {
        boolean creciente = false;
        if (arrayNumbers [i] < arrayNumbers[i+1])
        {
            creciente = true;
            return creciente;
        }
        
        return creciente;
    }
    public boolean verification2(int [] arrayNumbers, int i)
    {
        boolean decreciente=false;
        if(arrayNumbers[i]>arrayNumbers[i+1]){
            decreciente  = true;
            return decreciente;
        }
        return decreciente;
    }
}