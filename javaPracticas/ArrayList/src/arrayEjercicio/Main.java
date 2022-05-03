/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayEjercicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String [] args)
    {
        ArrayList <Atleta> arrayatletas=  new ArrayList<Atleta>();
        int optionNumber, contElements=0;
        boolean exitProgram = false;
        int j = 0;
        Atleta aux, atleta;
        //Mostrar Interfaz Inicial
        
        
        do
        {
           optionNumber = Class.showInitialInterface();
           if(optionNumber == 1)
           {
               do
               {
                    contElements  = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE PARTICIPANTES"));
               }while(contElements < 0);
               
               for(int i = 0 ; i < contElements;i++)
               {
                   atleta=Class.inputAtleta(i);
                   arrayatletas.add(atleta);
               }
               for (int i = 0; i < contElements; i++) {
                   System.out.println(arrayatletas.get(i).getNombre());
               }

               contElements = arrayatletas.size();
               
               for (int i = 0; i < contElements; i++) {
                   for (int k = 0; k < contElements-1; k++) {
                       if(arrayatletas.get(k).getMinutos() > arrayatletas.get(k+1).getMinutos())
                       {
                             aux = arrayatletas.get(k+1);
                             arrayatletas.set(k+1,arrayatletas.get(k));
                             arrayatletas.set(k, aux);
                       }
                   
                   }
                }
           }
           else if (optionNumber  == 2) {
               if(arrayatletas.size() == 0)
               {
                   JOptionPane.showMessageDialog(null,"NO HAY PARTICIPANTES");
               }
               else
               {
                   System.out.println("ID | NOMBRE | NACIONALIDAD | MINUTOS");
                   for(int i = 0 ; i < contElements; i++)
                   {
                       arrayatletas.get(i).mostrarDatos(i);
                   }
               }
           }
           else
           {
                exitProgram = true;
                JOptionPane.showMessageDialog(null,"SALIENDO DEL PROGRAMA");
           }
           
        }while(exitProgram != true);
        
    }
}
