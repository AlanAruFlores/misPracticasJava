/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio13;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    public int inputNumbers(int i)
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
        
        return number;
    }
    public int verificationTypeOfNumber(int [] arrayNumbers, int i)
    {
        if(arrayNumbers[i] % 2 == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public int verificationTypeOfNumber4(int [] arrayNumbers, int i)
    {
        if(arrayNumbers[i] % 2 != 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
