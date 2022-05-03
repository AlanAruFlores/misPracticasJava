/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio9;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Arreglos9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarrollar un programa donde tenga un array de 10 elementos enteros, y que me desplaze cada elemento 1 lugar atras
        
        int[] arrayNumbers = new int[10];
        int aux;
        for(int i = 0 ; i<arrayNumbers.length ; i++)
        {
            arrayNumbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  numero "+(i+1)+" del Array"));
        }
        aux = arrayNumbers[9];
        for(int  i = 8; i>=0 ; i--)
        {
            arrayNumbers[i+1] = arrayNumbers[i];

        }
        arrayNumbers[0] = aux;
        
        for(int elementos: arrayNumbers)
        {
            System.out.print("["+elementos+"]-");
        }
        
        
        
        
    }
    
}
