/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntradadedatosArreglos;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class entradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Para agregar datos a mis Arreglos hacemos de la siguiente manera:
        int cantidadElementos;
        cantidadElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del Array"));
        //esta variable cantidadElementos determinara definidamente cuantos datos tendra dentro nuestro vector
        char [] letras = new char [cantidadElementos];
        for(int i =0;i<cantidadElementos;i++)
        {
           letras[i] = JOptionPane.showInputDialog("Digite el caracter "+(i+1)).charAt(0);
                 
        }
        //.charAT(1) nos va a guardar la segunda Letra del Array del Caracter
        for(int i=0; i<cantidadElementos;i++)
        {
            System.out.println("Letra "+(i+1)+": "+letras[i]);
        }
        
        
        
        
    }
    
}
