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
public class Arreglos7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarrollar una aplicacion que lea 10 numeros enteros en un array, verificar si es creciente, decreciente o desordenada
        Class clss = new Class();
        int [] arrayNumbers = new int [10];
        boolean creciente = false, decreciente = false;
        
        for(int i = 0 ; i<arrayNumbers.length;i++)
        {
            arrayNumbers[i] = clss.inputNumbers(i);
        }
        
        for(int i=0 ; i<arrayNumbers.length-1;i++)
        {
        
            creciente = clss.verification1(arrayNumbers, i);
            decreciente = clss.verification2(arrayNumbers,i);
        }
        
        if(creciente == true && decreciente == false)
        {
            JOptionPane.showMessageDialog(null,"El arreglo es creciente");
        }
        if(decreciente == true && creciente == false)
        {
                JOptionPane.showMessageDialog(null,"El arreglo es decreciente");
        }
        if(creciente == true && decreciente == true)
            {
                JOptionPane.showMessageDialog(null,"El arreglo esta desordenado");
            }
        if(creciente == false && decreciente == false)
            {
                JOptionPane.showMessageDialog(null,"El arreglo es constante");
            }
       
    }
    
}
