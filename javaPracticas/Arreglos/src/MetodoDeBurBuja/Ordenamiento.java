/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoDeBurBuja;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El metodo burbuja nos sirve para ordenar un arreglo con valores mezclados
        int array[],nElements, aux = 0;
        
        nElements = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos que va a contener el arreglo"));
        
        array = new int [nElements];
        
        //Agregamos valores al Array
        for (int i = 0 ; i<array.length ; i++)
        {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor "+(i+1)));
        }
        System.out.println("Array Desordenado");
        for(int elementos: array)
        {
            System.out.print("["+elementos+"]-");
        }
        
        //Metodo Burbuja:
        for(int i =0 ; i<(nElements-1);i++)
        {
            for(int j = 0 ; j < (nElements-1) ; j++)
            {
                if(array[j] > array[j+1])
                {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        System.out.println("\nArray Ordenado (Creciente):");
        for(int elemento: array)
        {
            System.out.print("["+elemento+"]-");
        }
        System.out.println("\nArray Ordenado (Decreciente):");
        for(int k  = (nElements-1); k>=0;k--)
        {
            System.out.print("["+array[k]+"]-");
        }
        JOptionPane.showMessageDialog(null,"Gracias!");
        
        
    }
    
}
