/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio6;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Menu {
    
    public static int getSuma(int nroComplejo, int nroComplejo2)
    {
        int suma = nroComplejo + nroComplejo2;
        return suma;
    }
    public static boolean compararNumeros(int nroComplejo, int nroComplejo2)
    {
        boolean comparacion = false;
        if (nroComplejo == nroComplejo2)
        {
            comparacion = true;
        }
        else
        {
            comparacion = false;
        }
        return comparacion;
    }
    public static int multiplicar()
    {
        int entero, numeroComplejo;
        numeroComplejo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero complejo a multilpicar"));
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero para multiplicarlo con el numero complejo"));
        
        
        int multiplicar  = numeroComplejo * entero;
        
        return multiplicar; 
    }
            
}
