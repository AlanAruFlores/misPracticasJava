/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistEjercicio3;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    public static void main (String [] args)
    {
        //Ejercicio: Leer e ingresar nombres dentro de un arryalist y permitirle al usuario que pueda mover un nombre a otro
        ArrayList <String> nombres = new ArrayList <String> (); 
        Scanner entrada = new Scanner (System.in);
        
        String nombre, aux;
        int newPositionName, k = 0, newPositionName2, contName;
        
        contName = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE NOMBRES"));
        nombres.ensureCapacity(contName);
        
        
        for (int i = 0 ; i < contName; i++)
        {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE "+(i+1));
            nombres.add(nombre);
        }
        
        System.out.println("LISTA DE NOMBRES:");
        {
            k++;        for (String name : nombres)

            System.out.println(k+""+name);
        }
        
        System.out.println("DIGITE LA POSICION A REEMPLAZAR");
        newPositionName = entrada.nextInt();
        newPositionName--;
        System.out.println("DIGITE EL NRO A QUE NOMBRE LO DESEA MOVER");
        newPositionName2 = entrada.nextInt();
        newPositionName2--;
        
        aux = nombres.get(newPositionName2);
        nombres.set(newPositionName2, nombres.get(newPositionName));
        nombres.set(newPositionName, aux);
        
        System.out.println("LISTA MODIFICADA");
        for(String name : nombres)
        {
            System.out.println(name);
        }
        
        
    }
}
