/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscicloswhiledowhilefor;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class EjerciciosCiclosWhileDoWhileFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Diseñar un  programa  que muestre el producto de los primeros 10 numeros impares
        conteoImpar impar = new conteoImpar();
        int numero=1, contimpar=0, multiplicacionImpar = 1;
        boolean verificador = false;
        
        for(int i=1;i<=20;i+=2)
        {
            multiplicacionImpar*=i;
        }
        
        System.out.println("La multiplicacion de los primeros 10 numero fue de : "+multiplicacionImpar);
    }
        
    /* Forma de Entrada de datos
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
            verificador = impar.Impar(numero);
            if (verificador == true)
            {
                contimpar++; 
                multiplicacionImpar = multiplicacionImpar * numero;
                System.out.println("Numero Impar: "+numero);
            }
        Forma Larga: 
                do
        {
            numero++;
            verificador = impar.Impar(numero); Funcion Booleana verifica si el numero es par e impar 
            y devuelve true si es verdadera o false si no es vedadera
            if(verificador== true)
            {
                System.out.println("Numero Impar: "+numero);
                multiplicacionImpar = multiplicacionImpar * numero;
                contimpar++;
            }
            }while(contimpar <= 10);
        Forma Corta:
                do
        {
            verificador  = impar.Impar(numero);
            if(verificador ==true)
            {
                multiplicacionImpar*=numero;
                contimpar++;
            }
            numero+=2;
        }while(contimpar <= 10);
        Forma muy Corta:
                for(int i=1;i<=20;i+=2)
        {
            multiplicacionImpar*=i;
        }
    */
}
