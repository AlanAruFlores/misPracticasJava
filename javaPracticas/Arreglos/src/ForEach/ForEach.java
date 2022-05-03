/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForEach;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* For each:
            Este nos sirve para imprimir datos de un Array de una forma mas sencilla que el bucle for
        Ejemplo: */
        int[] numero = {1,2,3,4};    
        
        //Esto nos dice que me vaya imprimiendo cada elemento entero del Array numero
        for(int elementos:numero)
        {
            System.out.println(""+elementos);
        }
        
        //Entraada de datos con for each
        
        int [] numeroEntrada = new int[4];
        int cont=0;
        for(int i: numeroEntrada)
        {
                numeroEntrada[cont] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(cont+1)));
                cont++;
        }
        for (int elementos: numeroEntrada)
        {
            System.out.println(elementos);
        }
        
        
    }
    
}
