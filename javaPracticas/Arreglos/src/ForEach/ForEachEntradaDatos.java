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
public class ForEachEntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //For Each como Entrada de datos
        int cantidadElementos,cont=0;
        cantidadElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Elementos"));
        int [] arregloNumeros = new int [cantidadElementos];
        
        for(int i=0;i<cantidadElementos;i++)
        {
            arregloNumeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
        }
        //Imprimir arreglo con length
        System.out.println("Imprimir numeros con .length");
        for(int i =0 ; i<arregloNumeros.length;i++)
        {
            System.out.println("Espacio del Arreglo "+(i+1)+" contiene el valor: "+arregloNumeros[i]);
            
        }
        System.out.println("Imprimir numeros con for each");
        for(int i : arregloNumeros)
        {
            cont++;
            System.out.println("Espacio del Arreglo "+cont+" contiene el valor :"+i);
        }
        
        
    }
    
}
