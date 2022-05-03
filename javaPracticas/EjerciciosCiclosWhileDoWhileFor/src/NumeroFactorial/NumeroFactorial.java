/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroFactorial;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class NumeroFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sacar el numero Factorial
        Clase NumeroFactorial = new Clase();
        int numero,factorial,i=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para sacar su factorial"));
        factorial = NumeroFactorial.NumeroFactorial(i,numero);
        System.out.println("El numero factorial de "+numero+" es: "+factorial);
    }
    
}
