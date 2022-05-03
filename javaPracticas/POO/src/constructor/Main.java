package constructor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sobrecarga de Metodos y Constructores
        Auto a1 = new Auto(100);
        Auto a2 = new Auto("Chevrolet", "Verde", 100);
        
        
        a1.arrancar(100);
        a2.arrancar();
    }
    
}
