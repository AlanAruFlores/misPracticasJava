/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    public static String inputName()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        return nombre;
    }
    public static int inputEdad()
    {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        return edad;
    }
}
