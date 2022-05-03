/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateti;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        ArrayList <Usuario> arrayUsers = new ArrayList <Usuario> ();
        
        int opcion;
        boolean exitProgram = false;
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO AL TATETI");
        
        for (int i = 0; i < 2; i++) {
            String nombre = JOptionPane.showInputDialog("ANTES DE EMPEZAR DIGITE LOS NOMBRES DE LOS 2 USUARIOS:");
            arrayUsers.add(new Usuario(nombre));
        }
        arrayUsers.trimToSize();
        
        
        do
        {
            opcion = Class.menu();
            if(opcion  == 1)
            {
                Class.playGame(arrayUsers); 
            }
            else if(opcion == 2)
            {
                for(int i = 0 ; i < 2 ; i++)
                {
                    arrayUsers.get(i).mostrarEstadisticas();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"GRACIAS POR USAR EL PROGRAMA");
                exitProgram = true;
            }
                
        }while(exitProgram != true);
        
        
    }
}
