/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayEjercicio;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Class {
    public static int showInitialInterface()
    {
        int optionNumber;
        JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA");
        do
        {
            optionNumber = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION "
                    + "\n[1]INGRESAR PARTICIPANTES"
                    + "\n[2]VER PSOCIONES"
                    + "\n[3]SALIR"));
        }while(optionNumber < 1 || optionNumber > 3); 
                
        return optionNumber;
    }
    public static Atleta inputAtleta(int i) 
    {
        Atleta atleta  = null;
        String nombre , nacionalidad;
        
        
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL PARTICIPANTE "+(i+1));      
        nacionalidad = JOptionPane.showInputDialog("DIGITE LA NACIONALIDAD DEL PARTICIPANTE"+(i+1)); 
        atleta = new Atleta (nombre,nacionalidad);

       return atleta;
    }
}
