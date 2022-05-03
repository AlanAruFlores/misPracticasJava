/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio2;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Clases {
    public int numeros(int i)
    {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog((i+1)+".Ingrese el numero"));
        
        return numero;
    }
    
}
