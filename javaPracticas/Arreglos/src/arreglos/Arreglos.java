/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author alang
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Introduccion en Arreglos
         Definir Arreglos*/
        int [] arreglo = new int[4];
        int cont = 1;
        arreglo[0] = 14;//Esta es la forma para asignar datos Enteros u otros en un Array.
        arreglo[1] = 15;
        arreglo[2] = 10;
        arreglo[3] = 19;
        //Para imprimir todos los valores hacemos de la siguiente manera:
        for(int i=0; i<=3; i++)
        {
            System.out.println("Arreglo Dato " + cont +" = "+arreglo[i]);
            cont++;
        }
        /*Otra forma de definir arreglos:
        Definir Arreglos:*/
        int [] arregloEntero = {1,2,3,4};
        cont = 1;
        for(int i = 0; i<arregloEntero.length; i++)
        {         
             System.out.println("Arreglo Dato "+cont+" = "+arregloEntero[i]);
             cont ++;
        }
        
    }
    
}
