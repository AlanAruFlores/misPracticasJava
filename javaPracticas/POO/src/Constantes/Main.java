/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constantes;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        int valor = JOptionPane.showInputDialog(null,)
        Persona p1 = new Persona("Ale", 19);
        //p1.setNombre("Alex"); no se le puede asignar un nombre nuevo porque el atributo ya esta en constante
        p1.setEdad(20);//Se le puede establecer una nueva edad porque no es constante el atributo
        p1.mostrarDatos();
    }
    
}
