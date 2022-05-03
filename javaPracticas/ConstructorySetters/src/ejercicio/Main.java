/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        /* Hacer un programa que contenga una colecciond e atletas y que deje en vacio
        a aquellos que no cumplan con los requisitos*/
        ArrayList <Persona> arrayPersonas = new ArrayList <Persona> ();
        String nombre;
        int nElements, edad,optionNumber, cont;
        nElements = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE PARTICIPANTES"));
        
        for (int i = 0; i < nElements; i++) {
            nombre = Class.inputName();
            edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL PARTICIPANTE "+(i+1)));
            arrayPersonas.add(new Persona(nombre, edad));
        }
        arrayPersonas.trimToSize();
        
        do
        {
            
            do
            {


                optionNumber = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                        + "\n[1]MOSTRAR"
                        + "\n[2]ELIMINAR A LOS NO PARTICIPANTES}"));
            }while( optionNumber < 1 || optionNumber >2);

            switch(optionNumber)
            {
                case 1:
                {
                    cont = arrayPersonas.size();
                    for (int i = 0; i < cont; i++) {
                        arrayPersonas.get(i).getAll();
                    }
                    break;
                }
                default:
                {
                     cont  = arrayPersonas.size();
                     for (int i = 0; i < cont; i++) {
                        if(arrayPersonas.get(i).getEstado() == "NO PARTICIPA")
                        {
                            arrayPersonas.remove(i);
                        }
                    }
                }
            }

        }while(true);
        
        
        
        
    }
}
