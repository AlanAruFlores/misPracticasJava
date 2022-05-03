/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioFOR42;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir 5 calificaciones   y definir si hay algun suspenso
        //Clases
        Control control = new Control();
        //Variables
        int notas, i, contSuspensos=0;
        
        for(i = 1; i<=5; i++)
        {
            notas = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota "+i+" del alumno "+i));
            control.Error(notas,i);
            contSuspensos+=control.contSuspenso(notas);
        }
        if(contSuspensos > 1)
        {
            JOptionPane.showMessageDialog(null,"Si hubo algun suspenso"
                    + "\nLa cantidad de suspensos fue de: "+contSuspensos);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No hubo ningun suspenso");
        }
    }
    
}
