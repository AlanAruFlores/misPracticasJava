/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio2;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 5 numeros y guardarlos en un Arreglo e imprimirlo inverso
        // Llamar Clase
        Clases clase = new Clases();
        //Definir Variables
        int [] numeros = new int[5];
        int [] arrayInverso = new int[5];

        // Cuando ponemos la .length nos indica en este caso que va a valer 5
        int cont=0,i=0, contInverso = 1, nroArray, contador;
        for(i=0;i<numeros.length;i++)
        {
            numeros[i] = clase.numeros(i);
        }
        System.out.println("Forma Inversa");
        
        for(i = numeros.length - 1 ; i>=0; i--)
        {
            System.out.println("El numero "+i+" es: "+numeros[i]);
        }
        
        System.out.println("Forma Original");
        for (int elementos: numeros)
        {
            cont++;
            System.out.println("El numero "+cont+" es: "+elementos);
        }
        /*
        System.out.println("Forma Inversa con For Each");
        contador = arrayInverso.length;
        
        for (int elementos: numeros)
        {
            nroArray = arrayInverso.length-contInverso;
            arrayInverso[nroArray] = elementos;
            contInverso++;
            System.out.println("El numero "+contador+" es: "+arrayInverso[nroArray]);          
            contador--;
            
        }
        */

    }
    
}
