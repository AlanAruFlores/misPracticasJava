/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio14;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static int encontrarPersona(ArrayList<Persona>arrayPersonas, int dni)
    {
        int indice = -1, cont = arrayPersonas.size();
        for (int i = 0; i < cont; i++) {
            if(arrayPersonas.get(i).getDni()  == dni)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LA PERSONA");
        }
        
        return indice;
    }
    public static void main(String [] args)
    {
        ArrayList<Persona> arrayPersonas = new ArrayList<>();
        Amigo inputAmigo;
        int option, indicePersona, dniEncontrar, salir=0;
        String nombreAmigo;
        
        do
        {
            option = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA OPCION"
                    + "[1]INGRESAR PERSONA"
                    + "[2]INGRESAR AMIGOS DE UNA PERSONA"
                    + "[3]MOSTRAR PERSONAS"
                    + "[4]SALIR"));
            switch(option)
            {
                case 1:
                {
                    arrayPersonas.add(inputPersona());break;
                }
                case 2:
                {
                    dniEncontrar = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI A ENCONTRAR"));
                    indicePersona = encontrarPersona(arrayPersonas, dniEncontrar);
                    if(indicePersona != -1)
                    {
                        nombreAmigo = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL AMIGO");
                        inputAmigo  = new Amigo (nombreAmigo);
                        arrayPersonas.get(indicePersona).setAmigo(inputAmigo);                                        
                    }
                    break;
                }
                case 3:
                {
                    System.out.println(arrayPersonas);break;
                }
                case 4:
                {
                    salir = -1;break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"OPCION INCORRECTA");
                }

            }
        }while (salir != -1);
        
        
        
        
        
    }
    public static Persona inputPersona()
    {
        String nombre;
        int edad, selectNacionalidad,dni;
        Pais nacionalidad = null;
        
        dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI"));
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        edad= Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        
        do
        {
        selectNacionalidad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA NACIONALIDAD"
                + "[1]PERU"
                + "[2]URUGUAY"
                + "[3]PARAGUAY"
                + "[4]NUEVA ZELANDA"));
        }while(selectNacionalidad < 1 || selectNacionalidad > 4);
        
        
        switch(selectNacionalidad)
        {
            case 1:
            {
                nacionalidad = nacionalidad.PERU;break;
            }
            case 2:
            {
                nacionalidad = nacionalidad.URUGUAY;break;
            }
            case 3:
            {
                nacionalidad = nacionalidad.PARAGUAY;break;
                
            }
            case 4:
            {
                nacionalidad = nacionalidad.NUEVA_ZELANDA;break;
            }
        }
        Persona persona = new Persona(dni,nombre,edad,nacionalidad);
        
        return persona;
    }
}
