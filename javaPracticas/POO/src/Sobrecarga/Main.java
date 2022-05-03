/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sobrecarga;

/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Una sobreecarga de metodos es cuando hay metodos con el mismo nombre pero son distintos debido a la cantidad de sus parametros
        Persona p1 = new Persona ("Ale", 22);
        Persona p2 = new Persona ("19293849");
        
        p1.mostrar();
        p2.mostrar(1000);
        
        
        
    }
    
}
