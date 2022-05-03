/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio11;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args)
    {
        //Realizar un ejercicio que nos muestre los amigos de cada persona
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Amigos> amigos = new ArrayList<>();
        Amigos amigo;
        int nPersonas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE CANTIDAD DE PERSONAS"));
        String nombre;
        int edad,opcion, salir=0;
        
        for (int i = 0; i < nPersonas; i++) {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA PERSONA");
            edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DE LA PERSONA"));
            personas.add(new Persona(nombre,edad));
        }
        do
        {
        opcion = ingresarOpcion();
        switch(opcion)
        {
            case 1:
            {
                if(personas.isEmpty())
                {
                    System.out.println("NO EXISTE NINGUNA PERSONA");
                }
                else
                {
                    System.out.println(personas);break;
                }
            }
            case 2:
            {
                if(amigos.isEmpty())
                {
                    System.out.println("NO EXISTE NINGUN AMIGO");
                }
                else
                {
                    System.out.println(amigos);break;
                }
            }
            case 3:
            {
                int nAmigos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE AMIGOS"));
                int indicePersona = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DE LA PERSONA"));
                indicePersona = verificarIndice(personas, indicePersona);
                if(indicePersona == -1)
                {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO A LA PERSONA");
                    
                }
                else
                {
                    for(int i = 0 ; i < nAmigos ; i++)
                    { 
                        String nombre_Amigo = JOptionPane.showInputDialog("DIGITE NOMBRE ");
                        amigo = new Amigos(nombre_Amigo);
                        amigos.add(amigo);
                        personas.get(indicePersona).setAmigos(amigo);
                    }
                }
                break;
                
            }
            case 4:
            {
                salir = 1;
            }
        }
        }while(salir != 1);
    }
    public static int verificarIndice(ArrayList<Persona> personas, int indice)
    {
        int encontrarIndice = -1;
        int cont = personas.size();
        for (int i = 0; i < cont; i++) {
            if(indice == personas.get(i).getId())
            {
                encontrarIndice = i;
            }
        }
        if(indice  == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO A LA PERSONA");
        }
        return encontrarIndice;
    }
    public static int ingresarOpcion()
    {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do
        {
            System.out.println("[1]VER PERSONAS"
                    + "[2]VER AMIGOS"
                    + "[3]INGRESAR AMIGOS"
                    + "[4]SALIR");
            opcion =entrada.nextInt();
        }while(opcion < 1 || opcion >4);
        return opcion;
    }
}
