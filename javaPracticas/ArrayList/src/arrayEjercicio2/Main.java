/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayEjercicio2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
 
    public static void main (String [] args)
    {
        //Desarrolar un programa, donde el usuario ingrese Nombres y luego pedir a quien eliminar
        ArrayList <String> listNames = new ArrayList <String> ();
        String nombre, deleteName; 
        int nElements = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE ELEMENTOS"));
        listNames.ensureCapacity(nElements);
        
        
        for (int i = 0 ; i < nElements; i++)
        {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE "+(i+1));
            nombre = nombre.toUpperCase();
            listNames.add(nombre);
        }
        
        deleteName = JOptionPane.showInputDialog("DIGITE EL NOMBRE A ELMINAR");
        deleteName = deleteName.toUpperCase();
        if(listNames.contains(deleteName) == true)
        {
            for (int i = 0; i<nElements; i++ )
            {
                if (listNames.get(i).equals(deleteName))
                {
                    listNames.remove(i);
                }
            }
            System.out.println("SI EXISTE EL NOMBRE, SE ELIMINO EXITOSAMENTE");
            for (String name : listNames)
            {
                System.out.println(name);
            }
        }
        else
        {
            System.out.println("NO EXISTE EL NOMBRE");
        }
        
    }
}
