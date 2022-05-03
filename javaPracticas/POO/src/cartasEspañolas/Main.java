/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartasEspañolas;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    static ArrayList<CartaEspañola> mazoEspañola = new ArrayList<CartaEspañola>();
    
    private static void establecerMazo()
    {
        for (int i = 0; i < 48; i++) {
            mazoEspañola.add(new CartaEspañola());
        }
    }
    public static void main(String[] args) {
        
        establecerMazo();
        mostrarCartas();
                
        
    }
    static void mostrarCartas()
    {
        for (CartaEspañola cartaEspañola : mazoEspañola) {
            System.out.println(cartaEspañola);
        }
    }
}
