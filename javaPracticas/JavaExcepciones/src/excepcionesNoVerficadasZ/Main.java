/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesNoVerficadasZ;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        
        try
        {
            int numero  = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO"));;
            System.out.println(numero);
        }
        catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR UN CARACTER O CADENA");
        }

            
            
    }
}
