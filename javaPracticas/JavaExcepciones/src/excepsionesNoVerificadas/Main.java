/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepsionesNoVerificadas;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void dividir()
    {
        int num = 3, num2 = 0;
        System.out.println(num/num2);   
    }
    public static void main(String[] args) {
        try
        {
            dividir();
        }
        catch(ArithmeticException ex)
        {
            JOptionPane.showMessageDialog(null,"ERROR, NO SE PUEDE DIVIDIR POR 0");
        }
    }
}
