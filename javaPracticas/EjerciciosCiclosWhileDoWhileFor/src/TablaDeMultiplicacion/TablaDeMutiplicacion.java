/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaDeMultiplicacion;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class TablaDeMutiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir que el usuario ingrese un numero del 0 y 10 y muestre la tabla de multiplicacion
        Error error = new Error();
        int numero, i,resultado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 10"));
        numero = error.nuevo_Numero(numero);
        
        System.out.println("La tabla multiplicacion de "+numero);
        for(i = 0; i<=10;i++)
        {
            resultado = numero * i;
            System.out.println(""+numero+" x "+i+" = "+resultado);
        }

                
    }
    
}
