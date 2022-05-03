/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio6;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarrollar un programa que tenga un menu que trabaje con 2 numeros complejos
        
        int opcion, nroComplejo, nroComplejo2,multiplicar,suma;
        boolean verificacion = false;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: "
                + "\n[1]Sumar 2 numeros complejos"
                + "\n[2]Comparar 2 numeros complejos"
                + "\n[3]Multiplicar un numero entero y un numero complejo"));
        
        switch(opcion)
        {
            case 1:    
            {
                nroComplejo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero complejo 1"));
                nroComplejo2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero complejo 2"));
                suma = Menu.getSuma(nroComplejo, nroComplejo2);
                System.out.println("La suma entre el numero complejo "+nroComplejo+"i + "+nroComplejo2+"i es = "+suma);
                break;
            }
            case 2:
            {
                
                nroComplejo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero complejo 1"));
                nroComplejo2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero complejo 2"));
                verificacion = Menu.compararNumeros(nroComplejo, nroComplejo2);
                if(verificacion == true)
                {
                    System.out.println("El numero complejo "+nroComplejo+"i es igual al "+nroComplejo2+"i");
                }
                else
                {
                    System.out.println("Los numeros complejos no son iguales");
                }
                break;
            }
            case 3:
            {
                multiplicar = Menu.multiplicar();
                System.out.println("La multiplicacion el numero entero y la multiplicacion es "+multiplicar);
                break;
            }
            default:
            {
                System.out.println("Opcion NO valida");
            }
        }
        System.out.println("Nos vemos");
        
        
        
    }
    
}
