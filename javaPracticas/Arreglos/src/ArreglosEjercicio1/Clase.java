/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio1;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Clase 
{
    public int Arreglo(int i)
    {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero "+(i+1))); 
            
        return numero;
    }
}
