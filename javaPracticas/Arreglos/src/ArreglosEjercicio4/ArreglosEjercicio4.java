/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio4;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class ArreglosEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir un Arreglo de 10 numeros y mostrar las al pantalla de primero , ultimo ,etc
        //Llamamos a la Class
        Class clss = new Class();
        
        int [] numbersArray = new int[10];
        int i=0,value=0, finalvalue=9, cont=0,longitud;
        
        for(i = 0; i<numbersArray.length;i++)
        {
            numbersArray[i] = clss.inputNumbers(i);
        }
        longitud = numbersArray.length;
        for(i=0;i<(numbersArray.length/2);i++)
        {
            cont++;
            System.out.println("Valor "+(cont)+" :"+numbersArray[i]);
            cont++;
            longitud--;
            System.out.println("Valor "+(cont)+" :"+numbersArray[longitud]);
        }
        
    }
    
}
