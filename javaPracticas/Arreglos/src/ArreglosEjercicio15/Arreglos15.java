/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio15;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Arreglos15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Desarrollar un programa que tenga un arreglo de 10 crecientemente, pedir al usuario que digite un
         elemento entero y que este se busque dentro del array*/
        //Llamamos a la clase "Class"
        Class clss = new Class();
        int [] arrayNumbers =new int[10];
        int searchValue,cont =0, k = 0;
        boolean creciente= false, encontrar= false;

        
        do
        {
            for ( int i = 0 ;i < arrayNumbers.length; i++)
            {
                arrayNumbers[i]=clss.inputNumbers(i);
                if(i == 9)
                {
                    for ( int j = 0; j<arrayNumbers.length-1;j++)
                    {
                        if(arrayNumbers[j] < arrayNumbers[j+1])
                        {
                            creciente = true;
                        }
                        else
                        {
                            creciente = false;break;
                        }           
                         
                    }
                }
            }
            if (creciente == false)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Daton Entradas exitosos");
            }
            
        }while(creciente == false);
        System.out.println("Array:");
        for(int elemento : arrayNumbers)
        {
            System.out.print("["+elemento+"]-");
        }
        searchValue = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero a buscar"));
        
        k = 0;
        
        
        /*Aca aclara que mientras k sea menor a la longitud y si el numero de la posicion del arrayNumber sea menor al balor a buscar
        esto nos sirve para que encuentre el valor desde el menor numero hasta el mayor*/
        while (k < arrayNumbers.length && arrayNumbers[k]<searchValue)
        {
            k++;
        }
        
        //Si recorrio todo el array entonces no encontro nada
        if(k == 10)
        {
            JOptionPane.showMessageDialog(null,"No se encontro  el valor a buscar");
        }
        else
        {
            //Si lo encontro aparece el mensaje
            if(arrayNumbers[k] == searchValue)
            {
                JOptionPane.showMessageDialog(null,"Se encontro el valor en la posicion: "+k);
            }
            //Si el numero a buscar es mayor a una cantidad determinada de numeros y menor a otra cantidad deeterminada de numeros 
            else
            {
                JOptionPane.showMessageDialog(null,"No se encontro el valor a buscar");
            }
        }
        
        
        /*
        System.out.println("\nIntentando encontrar el valor "+searchValue);
        for(int elementos: arrayNumbers)
        {
            cont++;
            if(elementos == searchValue)
            {
                System.out.println("Se encontro el valor "+searchValue+" esta en la posicion "+cont);
                JOptionPane.showMessageDialog(null,"Se encontro el valor ingresado en la tabla"
                        + ", esta esta en la posicion: "+cont);
                encontrar = true;
            }
            else
            {
                System.out.println("Buscando...");
                if(cont == 9 && encontrar !=true)
                {
                    System.out.println("No se encontro el valor "+searchValue);
                    JOptionPane.showMessageDialog(null,"No se encontro el valor ingresado");
                }
            }
        }
        */
        
    }
    
}
