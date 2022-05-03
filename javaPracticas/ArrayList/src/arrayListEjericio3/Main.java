/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListEjericio3;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main (String [] args )
    {
        //Desarollar un programa, que el usuario pueda modificar nombres, borrar o limpiar todo el array
        ArrayList <String> listNames = new ArrayList <String> ();
        int opcion, contElements=0;
        String continueProgram;
        

        do
        {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE QUE OPCION ELIGE:"
                + "\n[1]AGREGAR NOMBRES"
                + "\n[2]MOSTRAR NOMBRES"));
        
            switch (opcion)
            {
                case 1:
            
                    int nElements = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD ELEMENTOS"));
                    String nombre;
                    contElements+=nElements;
                    for (int i = 0 ; i < nElements; i++)
                    {
                        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE "+(i+1));
                        nombre = nombre.toUpperCase();
                        listNames.add(nombre); 
                    }
                    JOptionPane.showMessageDialog(null,"REGISTRO DE NOMBRES EXITOSO");
                    break;
            
                case 2:
                    if(listNames.size() == 0)
                    {
                        System.out.println("NO HAY NOMBRES REGISTRADOS");
                    }
                    else
                    {
                        for(String name : listNames)
                        {
                            System.out.println(name);
                        }
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("\n[1]MODIFICAR"
                                + "\n[2]ELIMINAR"
                                + "\n[3]LIMPIAR TODO EL REGISTO"
                                + "\n[4]SALIR"
                                + "\nDIGITE UNA OPCION:"));
                        
                        if(opcion == 1)
                        {
                            int i = 0;
                            String name = JOptionPane.showInputDialog("DIGITE NOMBRE A CAMBIAR");
                            name = name.toUpperCase();
                            for(String names : listNames)
                            {
                                
                                if(names.equals(name))
                                {
                                    String newName = JOptionPane.showInputDialog("DIGITE NUEVO NOMBRE A CAMBIAR");
                                    newName = newName.toUpperCase();
                                    
                                    listNames.set(i, newName);
                            
                                }
                                i++;
                            }
                            JOptionPane.showMessageDialog(null, "PROCESO EXITOSOS");

                        }
                        else if(opcion == 2)
                        {
                            int i = 0;
                            String nameRemove = JOptionPane.showInputDialog("DIGITE NOMBRE A ELMINIAR");
                            for(String names : listNames)
                            {
                                if(names == nameRemove)
                                {
                                    listNames.remove(i);
                                }
                                i++;
                            }
                            JOptionPane.showMessageDialog(null,"PROCESO EXITOSO");
                        }
                        else if(opcion == 3)
                        {
                            listNames.clear();
                            JOptionPane.showMessageDialog(null,"PROCESO EXITOSO");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"SALIENDO...");
                        }
                        
                    }
                    break;
            }
            continueProgram = JOptionPane.showInputDialog("DESEA VOLVER AL INICIO, DIGITE SI/NO");
            continueProgram = continueProgram.toUpperCase();
            
        }while(continueProgram.equals("SI"));
        
    }
}
