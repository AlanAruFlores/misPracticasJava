/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepsionesNoVerificadasVector;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) throws Excepsion0 {
        int numero;
        
        do{
            numero  = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO"));
            
            if(numero == 0 )
            {
                throw new Excepsion0("No se puede ingresar por cero");
            }
        }while(true);
    }
}
