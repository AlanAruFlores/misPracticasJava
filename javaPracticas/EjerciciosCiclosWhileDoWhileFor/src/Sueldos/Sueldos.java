/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sueldos;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir 10 sueldos, mostrar su suma y cuantos hay mayores de 1000$
        Clase clase = new Clase();
        float sueldo, sueldoTotal=0;
        int i,cont=0;
        boolean verificador=false;
        
        for(i=1;i<=10;i++)
        {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo "+i));
            while(sueldo <=0)
            {
                sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo "+i));
            }
            sueldoTotal+=sueldo;
            verificador=clase.verificador(sueldo);
            if(verificador  == true)
            {
                cont++;
            }
            
        }
        JOptionPane.showMessageDialog(null,"La sumatoria de los sueldos es: $"+sueldoTotal);
        JOptionPane.showMessageDialog(null,"Cantidad de sueldos mayores a 1000$: "+cont);
        
        
        
    }
    
}
