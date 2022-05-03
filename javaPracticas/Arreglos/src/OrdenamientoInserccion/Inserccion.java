/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoInserccion;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Inserccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Ordenamiento Inserccion es un ordenamiento de un arreglo igual a la que del "Metodo Burbuja2 pero con otra forma
        Si el  numero de la izquierda es mayor al numero Actual entonces va a ir cambiando  de posicion*/
        
        int array[], nElementos,pos=0,aux=0;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos del array"));
        
        array = new int[nElementos];
        
        for(int i = 0 ; i<nElementos; i++)
        {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
        }
        
        
        for (int i = 0 ; i<nElementos ; i++)
        {
            //Guardamos la posicion
            pos = i ;
            
            //Guardamos una copia del valor
            aux = array[i];
            //Aca el pos debe ser mayor a 0 para que este no compare el elemento de la pos -1 (no existe) 
            while((pos>0) && (array[pos-1]>aux))
            {
                //Si es mayor la pos anteerior entonces el numero chico va a tener coomo valor el numero anterior a este que es mayor
                array[pos] = array[pos-1];
                //Decementa pos para ver si el otro numero de la izquierda es mayor.
                pos--;
                
            }
            //Cuando se termine el bucle se reestablece el valor al que se estaba comparando
            array[pos] = aux;
        }
        
        System.out.println("Creciente:");
        for ( int elementos : array)
        {
            System.out.print("["+elementos+"]-");
        }
        System.out.println("\nDecreciente");
        for(int i = (nElementos-1) ; i>=0 ; i-- )
        {
            System.out.print("["+array[i]+"]-");
        }
        
        
    }
    
}
