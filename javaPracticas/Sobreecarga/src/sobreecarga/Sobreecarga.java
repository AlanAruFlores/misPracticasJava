/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecarga;

/**
 *
 * @author alang
 */
public class Sobreecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Una sobreecarga de constructores consiste en usar 2 constructores pero con distintos parametros
        Persona p1 = new Persona ("Ale", "Aru"); 
        p1.mostrarDatos();
        
    }
    
}
