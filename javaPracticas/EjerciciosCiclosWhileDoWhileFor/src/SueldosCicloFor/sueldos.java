/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SueldosCicloFor;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Introducir un numero de sueldos n, y mostrar el sueldo maximo
        Control control = new Control();
        
        int numeroSueldos,i;
        float sueldo,sueldoMaximo=0;
        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de sueldos"));
        
        for (i = 1; i<=numeroSueldos;i++)
        {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo "+i));
            sueldoMaximo = control.sueldoNuevo(sueldo, sueldoMaximo);
        }
        JOptionPane.showMessageDialog(null,"El sueldo maximo es: "+sueldoMaximo);
    }
    
}
