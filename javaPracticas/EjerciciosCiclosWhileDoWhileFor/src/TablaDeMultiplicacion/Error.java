/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaDeMultiplicacion;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Error {
    public int nuevo_Numero(int numero)
    {
        while (numero <0 || numero >10)
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nIngrese un numero entre 0 y 10"));
            
        }
        return numero;
    }
    
}
