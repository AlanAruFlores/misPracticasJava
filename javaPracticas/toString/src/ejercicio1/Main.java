/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import tostring.Persona;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        ArrayList <Persona>  personas = new ArrayList<Persona>();
        int nPersonas  =  Integer.parseInt(JOptionPane.showInputDialog("DIGITE NRO"));
        String nombre;
        int edad;
        for (int i = 0; i < nPersonas; i++) {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA PERSONA");
            edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
            personas.add(new Persona(nombre,edad));
        }
        
        System.out.println(personas);
        
        for( Persona persona : personas)
        {
            System.out.println(persona);
        }
    }
    
}
