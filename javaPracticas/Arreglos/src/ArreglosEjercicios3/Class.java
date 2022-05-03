/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicios3;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    
    public int inputNumbers(int i)
    {
        int numeros;
        numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
        return numeros;
    
    }
    public boolean verificationNumbers(int numbers)
    {
        if(numbers > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public int contZero(int number)
    {
        if(number == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
