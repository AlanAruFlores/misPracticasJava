/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacto;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static int searchID(ArrayList<Persona>personas, int nroID)
    {
        int cont = personas.size(), indice = -1;
        for (int i = 0; i < cont; i++) {
            if(personas.get(i).getID() == nroID)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"ERROR, NO SE ENCONTRO EL ID");
        }
        return indice;
    }
    public static void main ( String [] args)
    {
        Scanner entrada= new Scanner(System.in);
        ArrayList<Persona> personas  = new ArrayList<>();
        int indicePersona, opcion, exitProgram = 0;
        
        for(int i = 0 ; i <  2; i++)
        {
            personas.add(inputPersona());
        }
        
        System.out.println("REGISTRADOS");
        System.out.println(personas);
        
        
        do
        {
            System.out.println("[1]LOGIN"
                    + "\n[2]SALIR");
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                {
                    int nroID, opcionUser, indice;
                    System.out.println("ID:");
                    nroID = entrada.nextInt();
                    indice = searchID(personas,nroID);
                    if(indice != -1)
                    {
                        mostrarMenu(personas, indice);                      
                    }
                    break;
                }
                case 2:
                {
                    exitProgram = 1;break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"ERROR");
                }
            }
            
        }while(exitProgram != 1);
        
        
    }
    public static void mostrarMenu(ArrayList<Persona>personas, int indice)
    {
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int salirPrograma = 0 ;
        Mensaje m;
        do
        {
            System.out.println("[1]ENVIAR MENSAJE"
                    + "\n[2]VER MENSAJES"
                    + "\n[3]SALIR");
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                {
                    int idReceptor, indiceReceptor;
                    System.out.println("DIGITE EL ID RECEPTOR");
                    idReceptor = entrada.nextInt();
                    indiceReceptor = searchID(personas,idReceptor);
                    if(indiceReceptor != -1)
                    {
                       m = inputMensaje();
                       personas.get(indice).enviarMensaje(personas.get(indiceReceptor), m);  
                    }
                    break;
                }
                case 2:
                {
                    if(personas.get(indice).getMensaje().isEmpty())
                    {
                        System.out.println("NO HAY MENSAJES");
                    }
                    else
                    {
                        System.out.println(personas.get(indice).getMensaje());
                    }
                    break;
                }
                case 3:
                {
                   salirPrograma = 1;break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"ERROR");
                }
                
            }
        }while(salirPrograma != 1);
    }
    public static Mensaje inputMensaje()
    {
        int dia, año;
        String contenido;
        Mensaje m;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DIA"));
        año = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL AÑO"));
        contenido = JOptionPane.showInputDialog("CONTENIDO DEL MENSAJE:");
        m = new Mensaje(año,dia,contenido);
        return m;
    }
    public static Persona inputPersona()
    {
        Persona persona;
        String nombre;
        Nacionalidad nacionalidad = null;
        int edad,selectOption;
        
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        
        do
        {
            selectOption = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA NACIONALIDAD:"
                    + "\n[1]PERU"
                    + "\n[2]ALEMANIA"
                    + "\n[3]ARGENTINA"
                    + "\n[4]URUGUAY"
                    + "\n[5]NUEVA ZELANDA"));
        }while (selectOption < 1 || selectOption>5);
        
        switch(selectOption)
        {
            case 1:
            {
                nacionalidad = nacionalidad.PERU;break;
            }
            case 2:
            {
                nacionalidad =nacionalidad.ALEMANIA;break;
            }
            case 3:
            {
                nacionalidad = nacionalidad.ARGENTINA;break;
            }
            case 4: 
            {
                nacionalidad = nacionalidad.URUGUAY;break;
            }
            default:
            {
                nacionalidad = nacionalidad.NUEVA_ZELANDA;break;
            }
        }
        
        persona = new Persona(nombre,edad,nacionalidad);
        
        return persona;
    }
    
}
