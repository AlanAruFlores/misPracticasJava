/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author alang
 */
public class constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Como hacer metodos contructores en JAVA.
        //Aca cree 2 objetos
        Persona p1 = new Persona ("Axel", 24);
        Persona p2 = new Persona ("Aro",20);
        //Aca muestro los datos de los objetos.
        p1.mostrarDatos();
        p2.mostrarDatos();
        
        
    }
    
}
