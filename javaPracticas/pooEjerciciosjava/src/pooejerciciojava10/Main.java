/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava10;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        Scanner entrada= new Scanner(System.in);
        ArrayList <Persona> arrayPersona = new ArrayList<Persona>();
        int opcion,indice,opcionUser, exitUser=0, indiceAmigo;
        String mail;
        boolean exitProgram = false;
        do
        {
            opcion = menu();
            switch(opcion)
            {
                case 1:
                {
                    arrayPersona.addAll(agregarPersonas());break;
                }
                case 2:
                {
                    indice = loginUser(arrayPersona);
                    if(indice == -1)
                    {
                        JOptionPane.showMessageDialog(null,"LOGIN FALLIDO");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"LOGIN EXITOSO");
                        do
                        {
                            opcionUser = selectActionOfUser(arrayPersona, indice);
                            switch(opcionUser)
                            {
                                case 1:
                                {
                                    indiceAmigo = agregarAmigosIndice(arrayPersona, indice);
                                    if( indiceAmigo  == -1)
                                    {
                                        JOptionPane.showMessageDialog(null,"AMIGO NO ENCONTRADO");
                                    }
                                    else
                                    {
                                        arrayPersona.get(indice).setAmigos(arrayPersona.get(indiceAmigo));
                                        arrayPersona.get(indiceAmigo).setAmigos(arrayPersona.get(indice));
                                        JOptionPane.showMessageDialog(null,"AMIGO EXITOSO");
                                    }
                                    break;
                                }
                                case 2:
                                {
                                    arrayPersona.get(indice).mostrarAmigos();break;
                                }
                                case 3:
                                {
                                    arrayPersona.get(indice).mostrarMensajes();break;
                                } 
                                case 4:
                                {
                                    if(arrayPersona.get(indice).getAmigos().isEmpty())
                                    {
                                        System.out.println("NO HAY AMIGOS");
                                    }
                                    else
                                    {
                                        arrayPersona.get(indice).mostrarAmigos();
                                        int indiceMensaje=-1, dia, mes, año;
                                        Mensaje newMensaje;                                      
                                        String mensaje;
                                        
                                        System.out.println("DIGITE EL MAIL DE ALGUNO DE SUS AMIGOS");
                                        mail = entrada.next();
                                        mail = mail.toLowerCase();
                                        
                                        indiceMensaje = encontrarIndiceDelAmigo(arrayPersona, indice,mail);
                                        
                                        if(indiceMensaje != -1)
                                        {
                                            int cont = arrayPersona.size();
                                            System.out.print("MENSAJE: ");
                                            mensaje = entrada.next();
                                            System.out.println("DIGITE EL DIA");
                                            dia = entrada.nextInt();
                                            System.out.println("DIGITE EL MES");
                                            mes = entrada.nextInt();
                                            System.out.println("DIGITE EL AÑO");
                                            año = entrada.nextInt();
                                            
                                            newMensaje = new Mensaje(dia,mes,año,mensaje,arrayPersona.get(indice).getNombre());                                                          
                                            arrayPersona.get(indice).getAmigos().get(indiceMensaje).saveMensajes(newMensaje);
                                            for (int i = 0; i < cont; i++) {
                                                if(arrayPersona.get(i).getMail().equals(mail))
                                                {
                                                    arrayPersona.get(i).setMensajes(newMensaje);break;
                                                }
                                            }
                                            JOptionPane.showMessageDialog(null,"MENSAJE EXITOSO");
                                            
                                        }
                                        else
                                        {
                                            System.out.println("NO SE ENCONTRO AL AMIGO");
                                        }
                                        break;
                                        
                                    }
                                    break;
                                }
                                default:
                                {
                                    exitUser = 1;
                                    break;
                                }

                            }
                            //exitUser = menuUser(opcion, arrayPersona, indice);
                        }while(exitUser != 1);
                    }
                    break; 
                }
                default:
                {
                    exitProgram = true;
                }
            }
            
        }while(exitProgram != true);
        
        
        
        
    }
    
    public static int menu()
    {
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        
        do
        {
        System.out.println("DIGITE UNA OPCION"
                + "\n[1]REGISTER"
                + "\n[2]LOGIN"
                + "\n[3]SALIR");
        opcion = entrada.nextInt();
        }while(opcion < 1 || opcion >3);
        
        
        return opcion;
    }
    
    public static int selectActionOfUser(ArrayList <Persona> persona , int indice)
    {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do
        {
            System.out.println("BIENVIENIDO "+persona.get(indice).getNombre()+""
                    + "DIGITE UNA OPCION"
                    + "\n[1]AGREGAR AMIGOS"
                    + "\n[2]MOSTRAR AMIGOS"
                    + "\n[3]VER MENSAJES"
                    + "\n[4]ENVIAR MENSAJE"
                    + "\n[5]SALIR");
            opcion = entrada.nextInt();
            
        }while(opcion < 1 || opcion > 5);
        
        return opcion;
    }
    /*
    public static int menuUser(int opcion, ArrayList<Persona> persona ,int indice)
    {
        int exitUser = 0, indiceAmigo;

        return exitUser;
    }
    */
    public static ArrayList<Persona>agregarPersonas()
    {
        ArrayList<Persona> persona = new ArrayList<Persona>();
        ArrayList <Amigo> amigos = new ArrayList<Amigo>();
        
        int nPersonas =Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE PERSONAS"));
        String nombre, mail, pais, contraseña;
        
        for (int i = 0; i < nPersonas; i++) {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA PERSONA");
            mail = JOptionPane.showInputDialog("DIGITE EL MAIL DE LA PERSONA");
            pais = JOptionPane.showInputDialog("DIGITE EL PAIS DE LA PERSONA");
            contraseña = JOptionPane.showInputDialog("DIGITE LA CONTRASEÑA DE LA PERSONA");
            persona.add(new Persona(nombre,mail,pais,contraseña));
           // amigos.add(new Amigo(persona.get(i).getNombre(),persona.get(i).getPais(), persona.get(i).getMail()));
        }
        
        
        return persona;    
    }
    
    public static int loginUser(ArrayList <Persona> persona)
    {
        Scanner entrada = new Scanner(System.in);
        int indice=-1, cont = persona.size();
        String mail, contraseña;
        
        System.out.println("LOGIN");
        System.out.print("MAIL:");
        mail = entrada.next();
        System.out.print("CONTRASEÑA: ");
        contraseña = entrada.next();   
        
        for (int i = 0; i < cont; i++) {
            if(mail.equals(persona.get(i).getMail()) && contraseña.equals(persona.get(i).getContraseña()))
            {
                indice = i;
            }
        }
        return indice;
    }
    public static int agregarAmigosIndice (ArrayList<Persona> personas, int indice)
    {
        String mail;
        int cont = personas.size(), indiceAmigo=-1;
        
        mail = JOptionPane.showInputDialog("DIGITE EL MAIL DEL AMIGO A INGRESAR");
        for (int i = 0; i < cont; i++) {
            if(mail.equals(personas.get(i).getMail()))
            {
                indiceAmigo = i;
                /*
                personas.get(indice).setAmigos(personas.get(i));
                personas.get(i).setAmigos(personas.get(indice));
*/
            }
            
        }
        
        return indiceAmigo;
    }
    public static int encontrarIndiceDelAmigo(ArrayList <Persona> arrayPersona, int indice, String mail)
    {      
        int cont = arrayPersona.get(indice).getAmigos().size();
        int indiceMensaje = -1;
        for (int i = 0; i <cont ; i++) {
            if(arrayPersona.get(indice).getAmigos().get(i).getMail().equals(mail))
            {
                indiceMensaje = i;
                break;
                                           
            }
        }
        if(indiceMensaje == -1)
        {
            JOptionPane.showMessageDialog(null,"AMIGO NO ENCONTRADO");
        }
        return indiceMensaje;
    }
}
