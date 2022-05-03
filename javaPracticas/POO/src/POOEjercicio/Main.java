/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarrollar un software que permita calcular el area y perimetro de el cuadrilatero
        Cuadrilatero cuadrilatero1 ;
        
        int lado1,lado2;
        
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 1 del cuadrilatero"));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 2 del cuadrilatero"));
        
        if(lado1 == lado2)
        {
            cuadrilatero1 = new Cuadrilatero(lado1);
        }
        else
        {
            cuadrilatero1 = new Cuadrilatero (lado1,lado2);
            
        }
         
        System.out.println("El perimetro es: "+cuadrilatero1.getPerimetro());
        System.out.println("El Area es: "+cuadrilatero1.getArea());
        
        
    }
    
}
