/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio12;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Arreglos12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer por teclado un array de 10 numeros y pedir al usuario que elimine una posicion sin dejar huecos
        Class cl_ass = new Class();
        
        int[] arrayNumber = new int[10];
        int[] array = new int[9];
        int deletePosition; 
        for(int i = 0;i<arrayNumber.length;i++)
        {
            arrayNumber[i] = cl_ass.inputValues(i);
        }
        deletePosition = cl_ass.delete();
        
        for (int  j = deletePosition; j <arrayNumber.length-1 ; j++)
        {
            arrayNumber[j] = arrayNumber[j+1];
            
        }
        for ( int i = 0 ; i<array.length; i++)
        {
            array[i] = arrayNumber[i];
        }
        
        for(int elementos: array)
        {
            System.out.print("["+elementos+"]-");
        }
        
        /*
        for(int i = 0 ; i<arrayNumber.length; i++)
        {
            if(i != deletePosition)
            {
                System.out.println("["+arrayNumber[i]+"]-");
            }
        }
        */
        
    }
    
}
