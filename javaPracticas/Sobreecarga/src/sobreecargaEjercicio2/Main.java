/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecargaEjercicio2;

/**
 *
 * @author alang
 */
public class Main {
    
    public static void main ( String args[])
    {
        //Hacer un programa que determine si un Usuario desea ponerse un nombre o  si quiere ser invitado
        Cuenta c1 = new Cuenta ("Ale",19,"Alemania");
        Cuenta c2 = new Cuenta (null);
        
        c1.mostrarDatos();
        c2.mostrarDatos();
        
    }
    
}
