/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio1;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Arreglos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamamos a nuestra Clase
        Clase clase = new Clase();
        // Leer 5 numeros dentro de un arreglo y mostrarlos en pantalla en el mismo orden
        int numeros [] = new int[5];
        int cont=0;
        
        // En un arreglo si tengo [5] = [0],[1],[2],[3] y [4]
        
        for(int i = 0; i<numeros.length;i++)
        {
            numeros[i]=clase.Arreglo(i);
        }
        
        //1ra Forma
        for(int elementos: numeros)
        {
            cont++;
            System.out.println("El numero "+cont+" es: "+elementos);
        }
        //2da Forma
        System.out.println("2da Forma");
        for(int i = 0; i<numeros.length;i++)
        {
            System.out.println("El numero "+(i+1)+" es: "+numeros[i]);
        }
    }
    
}
