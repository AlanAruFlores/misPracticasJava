/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooTorneo;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    static Torneo torneo;
    
    private void organizarTorneo()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        double premio = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL PREMIO"));
        Domicilio domicilio = crearDomicilio();
        
        torneo = new Torneo(nombre, premio, domicilio);
    }
    private Domicilio crearDomicilio()
    {
        return new Domicilio("Lacarra",123);
    }
    public static void main(String[] args) {
        
        
        
    }
}
