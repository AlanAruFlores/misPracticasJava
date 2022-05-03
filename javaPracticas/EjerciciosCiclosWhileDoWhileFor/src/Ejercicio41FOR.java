/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Ejercicio41FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir 10 numero y determinar si se ha introducido algun negativo
        //Definir clases
        Clase clase = new Clase();
        
        //Definir Variables
        int numero,i,contNegativos=0;
        boolean negativos  = false;
        
        for(i=1; i<=10; i++)
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+i));
            contNegativos+=clase.contadorNegativos(numero);  
            if(contNegativos > 0)
            {
                negativos = true;
            }
        }
        
        if(negativos  == true)
        {
            JOptionPane.showMessageDialog(null,"En los numeros ingresados, hay uno o mas negativos");
            JOptionPane.showMessageDialog(null,"Cantidad de veces que se ingreso numeros negativo: "+contNegativos);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No hay ningun numero negativo introducido");
        }
        
    }
    
}
