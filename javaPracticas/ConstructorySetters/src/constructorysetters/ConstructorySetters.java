/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorysetters;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class ConstructorySetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INTRODUCCION
        //Para crear un objeto se hace de la siguiente manera
        Persona persona1 ;
        String nombre;
        int dni, f_nacimiento;
        
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU DNI"));
        f_nacimiento = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EN EL AÑO QUE NACIO"));
        
        
        persona1 = new Persona (nombre,dni,f_nacimiento);
        
        persona1.showPerson();
        
    }
    
}
